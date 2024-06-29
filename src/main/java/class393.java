import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ica")
public class class393 extends class601 {

    @OriginalMember(owner = "client!ica", name = "r", descriptor = "Lkq;")
    public static class345 field5647 = new class345();

    @OriginalMember(owner = "client!ica", name = "s", descriptor = "I")
    public static int field5648 = 0;

    @OriginalMember(owner = "client!ica", name = "l", descriptor = "I")
    public static int field5641;

    @OriginalMember(owner = "client!ica", name = "m", descriptor = "I")
    public static int field5642;

    @OriginalMember(owner = "client!ica", name = "n", descriptor = "I")
    public static int field5643;

    @OriginalMember(owner = "client!ica", name = "o", descriptor = "I")
    public static int field5644;

    @OriginalMember(owner = "client!ica", name = "p", descriptor = "I")
    public static int field5645;

    @OriginalMember(owner = "client!ica", name = "q", descriptor = "I")
    public static int field5646;

    @OriginalMember(owner = "client!ica", name = "t", descriptor = "[Lvi;")
    public static class370[] field5649;

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(B)V")
    public final void method41(byte arg0) {
        ++field5642;
        if (super.field8137.field4777.method679((byte) -78) && ~super.field8131 == -3) {
            super.field8131 = 1;
        }
        int var2 = 34 / ((59 - arg0) / 33);
        if (super.field8131 < 0 || ~super.field8131 < -3) {
            super.field8131 = this.method45(8976);
        }
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(II)V")
    public final void method43(int arg0, int arg1) {
        int var3 = -28 / ((arg0 - 22) / 34);
        super.field8131 = arg1;
        ++field5641;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IZI)V")
    public static final void method2459(int arg0, boolean arg1, int arg2) {
        if (arg2 != 1) {
            method2461(-40);
        }
        ++field5643;
        class240.method1621(arg0, true, class155.field2131.method978(class120.field1576, (byte) -113), arg1);
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(I)I")
    public final int method45(int arg0) {
        if (arg0 != 8976) {
            this.method2460(-67);
        }
        ++field5646;
        return 2;
    }

    @OriginalMember(owner = "client!ica", name = "a", descriptor = "(IB)I")
    public final int method36(int arg0, byte arg1) {
        if (arg1 != 22) {
            return 51;
        } else {
            ++field5644;
            return 1;
        }
    }

    @OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(Lqea;)V")
    public class393(class339 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!ica", name = "<init>", descriptor = "(ILqea;)V")
    public class393(int arg0, class339 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!ica", name = "b", descriptor = "(I)I")
    public final int method2460(int arg0) {
        ++field5645;
        if (arg0 != 0) {
            field5647 = null;
        }
        return super.field8131;
    }

    @OriginalMember(owner = "client!ica", name = "c", descriptor = "(I)V")
    public static void method2461(int arg0) {
        field5647 = null;
        field5649 = null;
        if (arg0 < 55) {
            method2459(-5, true, 117);
        }
    }
}
