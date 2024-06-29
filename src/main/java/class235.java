import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public class class235 extends class119 {

    @OriginalMember(owner = "client!ue", name = "E", descriptor = "Lfh;")
    public static class653 field3065 = new class653();

    @OriginalMember(owner = "client!ue", name = "y", descriptor = "B")
    public byte field3061;

    @OriginalMember(owner = "client!ue", name = "z", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!ue", name = "C", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!ue", name = "G", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!ue", name = "H", descriptor = "I")
    public int field3067;

    @OriginalMember(owner = "client!ue", name = "K", descriptor = "I")
    public static int field3069;

    @OriginalMember(owner = "client!ue", name = "L", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!ue", name = "B", descriptor = "Lsl;")
    public class461 field3063;

    @OriginalMember(owner = "client!ue", name = "J", descriptor = "Lnd;")
    public static class547 field3068;

    @OriginalMember(owner = "client!ue", name = "e", descriptor = "(I)V")
    public static void method1474(int arg0) {
        field3068 = null;
        field3065 = null;
        if (arg0 > -75) {
            method1476(127, (class288) null);
        }
    }

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "(I)I")
    public final int method922(int arg0) {
        int var2 = -107 / ((59 - arg0) / 59);
        ++field3070;
        return this.field3063 == null ? 0 : this.field3063.field6193 * 100 / (this.field3063.field6180.length - this.field3061);
    }

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "(B)[B")
    public final byte[] method921(byte arg0) {
        if (arg0 < 122) {
            method1475(16, -108);
        }
        ++field3062;
        if (!super.field1745 && ~this.field3063.field6193 <= ~(this.field3063.field6180.length - this.field3061)) {
            return this.field3063.field6180;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(II)V")
    public static final void method1475(int arg0, int arg1) {
        ++field3066;
        class197.field2684 = arg1;
        class534 var2 = class26.field470;
        synchronized (class26.field470) {
            if (arg0 == 0) {
                class26.field470.method3065(true);
            }
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(ILria;)V")
    public static final void method1476(int arg0, class288 arg1) {
        if (arg0 == 0) {
            if (arg1.field3655 == 5 && ~arg1.field3700 != 0) {
                class653.method3663(-3002, class386.field4930, arg1);
            }
            ++field3064;
        }
    }
}
