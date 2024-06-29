import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class684 extends class645 {

    @OriginalMember(owner = "client!fj", name = "q", descriptor = "I")
    private int field9628 = 0;

    @OriginalMember(owner = "client!fj", name = "m", descriptor = "I")
    public static int field9624;

    @OriginalMember(owner = "client!fj", name = "n", descriptor = "I")
    public static int field9625;

    @OriginalMember(owner = "client!fj", name = "o", descriptor = "I")
    public static int field9626;

    @OriginalMember(owner = "client!fj", name = "p", descriptor = "I")
    public static int field9627;

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Laj;Lmja;)V")
    public class684(class333 arg0, class443 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!fj", name = "e", descriptor = "(I)V")
    public static final void method3803(int arg0) {
        ++field9627;
        if (class314.field4522 != null) {
            class314.field4522 = null;
            class38.method270(arg0 ^ 2412, class271.field4010, class485.field6706, class270.field3986, class152.field2100);
            if (arg0 == -5) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(II)Z")
    public static final boolean method3804(int arg0, int arg1) {
        if (arg0 != 25757) {
            return true;
        } else {
            ++field9625;
            return arg1 == 3 || ~arg1 == -5;
        }
    }

    @OriginalMember(owner = "client!fj", name = "a", descriptor = "(IZ)V")
    public final void method1500(int arg0, boolean arg1) {
        ++field9624;
        int var3 = super.field8954.field10691.method3160(super.field8964.method1096(), class124.field1786, (byte) -91) - -super.field8954.field10695;
        if (arg0 < -93) {
            int var4 = super.field8954.field10697.method3543(0, class710.field9945, super.field8964.method1106()) - -super.field8954.field10696;
            super.field8964.method1109((float) (super.field8964.method1096() / 2 + var3), (float) (var4 - -(super.field8964.method1106() / 2)), 4096, this.field9628);
            this.field9628 += ((class443) super.field8954).field6226;
        }
    }
}
