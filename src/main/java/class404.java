import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class404 extends class72 {

    @OriginalMember(owner = "client!we", name = "k", descriptor = "J")
    public static long field5630 = 0L;

    @OriginalMember(owner = "client!we", name = "n", descriptor = "I")
    public static int field5633 = 0;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "Lmp;")
    public static class758 field5628 = new class758(16);

    @OriginalMember(owner = "client!we", name = "h", descriptor = "I")
    public static int field5627;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!we", name = "l", descriptor = "I")
    public static int field5631;

    @OriginalMember(owner = "client!we", name = "o", descriptor = "I")
    public static int field5634;

    @OriginalMember(owner = "client!we", name = "p", descriptor = "I")
    public static int field5635;

    @OriginalMember(owner = "client!we", name = "m", descriptor = "Lmr;")
    public static class142 field5632;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "(I)I", line = 5)
    public final int method2484(int arg0) {
        ++field5627;
        return arg0 != 27669 ? -13 : super.field1282;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(II)I", line = 17)
    public final int method58(int arg0, int arg1) {
        ++field5631;
        return arg1 != 11260 ? -78 : 1;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)I", line = 32)
    public final int method60(int arg0) {
        if (arg0 != -3271) {
            field5628 = null;
        }
        ++field5635;
        return 0;
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(Lcq;)V", line = 44)
    public class404(class464 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(II)V", line = 53)
    public final void method59(int arg0, int arg1) {
        ++field5634;
        super.field1282 = arg0;
        if (arg1 != 3) {
            this.method58(120, 77);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V", line = 67)
    public final void method55(int arg0) {
        ++field5629;
        if (super.field1282 != 1 && super.field1282 != 0) {
            super.field1282 = this.method60(-3271);
        }
        if (arg0 <= 30) {
            this.method58(121, 88);
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(B)V", line = 80)
    public static void method2485(byte arg0) {
        if (arg0 > 99) {
            field5632 = null;
            field5628 = null;
        }
    }

    @OriginalMember(owner = "client!we", name = "<init>", descriptor = "(ILcq;)V", line = 91)
    public class404(int arg0, class464 arg1) {
        super(arg0, arg1);
    }
}
