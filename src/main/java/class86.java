import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class86 extends class203 {

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
    private final int field1582;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    private final int field1580;

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "I")
    private final int field1584;

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "I")
    private final int field1586;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "Llc;")
    public static class143 field1581 = class66.method374("(U (X", -1);

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public static int field1577;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "I")
    public static int field1583;

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "I")
    public static int field1585;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "Lhc;")
    public static class151 field1578;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IBI)V")
    public final void method497(int arg0, byte arg1, int arg2) {
        int var4 = this.field1580 * arg2 >> 12;
        int var5 = this.field1582 * arg0 >> 12;
        ++field1585;
        int var6 = this.field1586 * arg2 >> 12;
        int var7 = this.field1584 * arg0 >> 12;
        if (arg1 < -17) {
            class231.method1571(var5, super.field3688, var7, var4, 27677, var6);
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(III)V")
    public final void method498(int arg0, int arg1, int arg2) {
        if (arg0 != -13349) {
            field1581 = null;
        }
        ++field1579;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(B)V")
    public static void method499(byte arg0) {
        if (arg0 != -1) {
            field1581 = null;
        }
        field1581 = null;
        field1578 = null;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BII)V")
    public final void method500(byte arg0, int arg1, int arg2) {
        ++field1577;
        int var4 = -126 % ((arg0 - -14) / 59);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)Z")
    public static final boolean method501(int arg0, int arg1) {
        class104.field1825 = 65535 & arg0 + 1;
        class254.field4556 = true;
        int var2 = 41 % ((22 - arg1) / 49);
        ++field1583;
        return true;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Llc;II)V")
    public static final void method502(class143 arg0, int arg1, int arg2) {
        ++class217.field3965;
        class285.field5010.method799(103, arg1);
        ++field1587;
        class285.field5010.method1248((byte) 28, arg0.method874(arg1 ^ 175));
        class285.field5010.method1284((byte) 45, arg2);
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(IIIIII)V")
    public class86(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field1582 = arg1;
        this.field1580 = arg0;
        this.field1584 = arg3;
        this.field1586 = arg2;
    }
}
