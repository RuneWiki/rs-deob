import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class365 extends Exception {

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "Ljk;")
    public static class585 field4915 = new class585(23, 8);

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field4914;

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(IB[B)I")
    public static final int method2113(int arg0, byte arg1, byte[] arg2) {
        if (arg1 >= -64) {
            return 87;
        } else {
            field4916++;
            return class659.method3732(arg0, 91, 0, arg2);
        }
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(B)V")
    public static final void method2114(byte arg0) {
        if (arg0 <= 22) {
            field4915 = null;
        }
        field4917++;
        if (class84.field1199 == null) {
            class661 var1 = new class661();
            byte[] var2 = var1.method3743(128, 128, 16, 0);
            class84.field1199 = class699.method3918(false, var2, true);
        }
        if (class201.field2430 == null) {
            class664 var3 = new class664();
            byte[] var4 = var3.method3751(128, 128, (byte) -110, 16);
            class201.field2430 = class699.method3918(false, var4, true);
        }
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(B)V")
    public static void method2115(byte arg0) {
        int var1 = -83 / ((arg0 + 59) / 35);
        field4915 = null;
    }
}
