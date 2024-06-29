import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public abstract class class629 extends class214 {

    @OriginalMember(owner = "client!cf", name = "A", descriptor = "S")
    public short field8518;

    @OriginalMember(owner = "client!cf", name = "y", descriptor = "I")
    public static int field8516;

    @OriginalMember(owner = "client!cf", name = "B", descriptor = "I")
    public static int field8519;

    @OriginalMember(owner = "client!cf", name = "C", descriptor = "I")
    public static int field8520;

    @OriginalMember(owner = "client!cf", name = "D", descriptor = "I")
    public static int field8521;

    @OriginalMember(owner = "client!cf", name = "z", descriptor = "Lcp;")
    public static class753 field8517;

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(IIIIII)V", line = 5)
    public class629(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super.field2815 = arg1;
        this.field8518 = (short) arg5;
        super.field2809 = (byte) arg4;
        super.field2810 = arg2;
        super.field2802 = arg0;
        super.field2813 = (byte) arg3;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Lha;Z)Z", line = 18)
    public final boolean method1389(class66 arg0, boolean arg1) {
        ++field8521;
        return !arg1 ? true : class482.method2835(81, super.field2809, super.field2802 >> class478.field6717, super.field2810 >> class478.field6717);
    }

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "(I)V", line = 29)
    public static void method3473(int arg0) {
        if (arg0 <= 107) {
            field8517 = null;
        }
        field8517 = null;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B[Luaa;)I", line = 41)
    public final int method1388(byte arg0, class127[] arg1) {
        if (arg0 >= -78) {
            this.field8518 = 1;
        }
        ++field8516;
        return this.method1385(super.field2810 >> class478.field6717, (byte) -116, arg1, super.field2802 >> class478.field6717);
    }

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "(I)V", line = 53)
    public static final void method3474(int arg0) {
        class462.field6577 = class366.method2304(0.4F, arg0, 8, 97, true, 35, 4, 2048);
        ++field8520;
    }

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)Z", line = 61)
    public final boolean method1383(int arg0) {
        int var2 = 11 / ((-48 - arg0) / 41);
        ++field8519;
        return class408.field5778[(super.field2802 >> class478.field6717) + -class130.field1787 + class278.field4025][(super.field2810 >> class478.field6717) + -class468.field6610 + class278.field4025];
    }
}
