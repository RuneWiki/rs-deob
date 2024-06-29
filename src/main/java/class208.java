import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class208 {

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
    public static int field3590 = 0;

    @OriginalMember(owner = "client!gl", name = "i", descriptor = "Lp;")
    public static class280 field3596 = class18.method140((byte) -124, ",Mcran)2titre ouvert");

    @OriginalMember(owner = "client!gl", name = "h", descriptor = "Lp;")
    public static class280 field3595 = class18.method140((byte) -120, "gelb:");

    @OriginalMember(owner = "client!gl", name = "d", descriptor = "[I")
    public static int[] field3591 = new int[50];

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "I")
    public static int field3588;

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "I")
    public static int field3589;

    @OriginalMember(owner = "client!gl", name = "f", descriptor = "I")
    public static int field3593;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
    public static int field3597;

    @OriginalMember(owner = "client!gl", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3592;

    @OriginalMember(owner = "client!gl", name = "g", descriptor = "[I")
    public static int[] field3594;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)V")
    public static final void method1402(int arg0, int arg1, int arg2) {
        field3589++;
        class157 var3 = class257.method1740(arg0, (byte) -109, arg2);
        var3.method1112((byte) 105);
        var3.field2748 = arg1;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V")
    public static void method1403(byte arg0) {
        field3596 = null;
        field3595 = null;
        field3591 = null;
        field3592 = null;
        if (arg0 == 97) {
            field3594 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)V")
    public static final void method1404(int arg0) {
        class93.field1510.method1485((byte) -71);
        class264.field4653.method1485((byte) -115);
        field3593++;
        if (arg0 == 0) {
            class162.field2856.method1485((byte) -107);
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(III)Lsj;")
    public static final class49 method1405(int arg0, int arg1, int arg2) {
        class162 var3 = class220.field3787[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class49 var4 = var3.field2852;
            var3.field2852 = null;
            return var4;
        }
    }
}
