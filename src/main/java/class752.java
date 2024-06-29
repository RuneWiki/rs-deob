import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class752 {

    @OriginalMember(owner = "client!sw", name = "d", descriptor = "I")
    public int field10481;

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "[I")
    public int[] field10479;

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "[I")
    public int[] field10480;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "Lqe;")
    public static class465 field10478 = new class465(33, -1);

    @OriginalMember(owner = "client!sw", name = "f", descriptor = "I")
    public static int field10483 = 52;

    @OriginalMember(owner = "client!sw", name = "e", descriptor = "I")
    public static int field10482;

    @OriginalMember(owner = "client!sw", name = "h", descriptor = "J")
    public static long field10485;

    @OriginalMember(owner = "client!sw", name = "g", descriptor = "Leq;")
    public static class209 field10484;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)V", line = 10)
    public static void method4171(int arg0) {
        field10478 = null;
        field10484 = null;
        if (arg0 != 4) {
            field10478 = null;
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(II)V", line = 21)
    public static final void method4172(int arg0, int arg1) {
        field10482++;
        class354 var2 = class501.method3012(arg0, 4, 2145997216);
        if (arg1 != -11571) {
            method4171(-42);
        }
        var2.method2216(arg1 + 11571);
    }

    @OriginalMember(owner = "client!sw", name = "<init>", descriptor = "(I)V", line = 34)
    public class752(int arg0) {
        this.field10481 = arg0;
        this.field10479 = new int[this.field10481];
        this.field10480 = new int[this.field10481];
    }
}
