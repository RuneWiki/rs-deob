import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class318 extends class366 {

    @OriginalMember(owner = "client!rc", name = "D", descriptor = "Ldj;")
    public static class191 field4662 = new class191(8);

    @OriginalMember(owner = "client!rc", name = "E", descriptor = "I")
    public static int field4663 = 0;

    @OriginalMember(owner = "client!rc", name = "G", descriptor = "I")
    public static int field4665 = 0;

    @OriginalMember(owner = "client!rc", name = "C", descriptor = "I")
    public static int field4661;

    @OriginalMember(owner = "client!rc", name = "F", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V")
    public static final void method2115(int arg0) {
        class15 var1 = class332.field4822;
        synchronized (class332.field4822) {
            class332.field4822.method102((byte) -107);
        }
        if (arg0 != 8) {
            field4663 = -51;
        }
        field4661++;
        class15 var2 = class258.field3826;
        synchronized (class258.field3826) {
            class258.field3826.method102((byte) -121);
        }
    }

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "(I)V")
    public static void method2116(int arg0) {
        field4662 = null;
        if (arg0 >= -70) {
            field4665 = -69;
        }
    }

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "(I)I")
    public static final int method2117(int arg0) {
        field4664++;
        if (arg0 != 20497) {
            method2117(-51);
        }
        return 2;
    }
}
