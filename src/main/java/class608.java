import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iv")
public class class608 extends class331 {

    @OriginalMember(owner = "client!iv", name = "m", descriptor = "I")
    public static int field8428;

    @OriginalMember(owner = "client!iv", name = "n", descriptor = "I")
    public static int field8429;

    @OriginalMember(owner = "client!iv", name = "o", descriptor = "I")
    public static int field8430;

    @OriginalMember(owner = "client!iv", name = "p", descriptor = "I")
    public static int field8431;

    @OriginalMember(owner = "client!iv", name = "q", descriptor = "I")
    public static int field8432;

    @OriginalMember(owner = "client!iv", name = "r", descriptor = "I")
    public static int field8433;

    @OriginalMember(owner = "client!iv", name = "s", descriptor = "I")
    public static int field8434;

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(II)I")
    public final int method222(int arg0, int arg1) {
        ++field8430;
        if (arg1 != 1) {
            this.method3332((byte) 121);
        }
        return 1;
    }

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "(B)I")
    public final int method3332(byte arg0) {
        ++field8434;
        return arg0 >= -119 ? -76 : super.field4202;
    }

    @OriginalMember(owner = "client!iv", name = "d", descriptor = "(B)V")
    public static final void method3333(byte arg0) {
        if (~class513.field7232 > -1) {
            class513.field7232 = 0;
            class90.field1143 = -1;
            class345.field4470 = -1;
        }
        ++field8429;
        int var1 = -127 / ((39 - arg0) / 38);
        if (~class513.field7232 < ~class341.field4439) {
            class345.field4470 = -1;
            class90.field1143 = -1;
            class513.field7232 = class341.field4439;
        }
        if (class758.field10552 < 0) {
            class90.field1143 = -1;
            class345.field4470 = -1;
            class758.field10552 = 0;
        }
        if (class758.field10552 > class341.field4437) {
            class758.field10552 = class341.field4437;
            class345.field4470 = -1;
            class90.field1143 = -1;
        }
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(ILts;)V")
    public class608(int arg0, class41 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!iv", name = "a", descriptor = "(I)V")
    public final void method224(int arg0) {
        if (super.field4202 != 1 && super.field4202 != 0) {
            super.field4202 = this.method226((byte) 13);
        }
        ++field8428;
        if (arg0 != -1959) {
            field8432 = -44;
        }
    }

    @OriginalMember(owner = "client!iv", name = "c", descriptor = "(II)V")
    public final void method227(int arg0, int arg1) {
        ++field8431;
        if (arg0 <= 113) {
            field8432 = 108;
        }
        super.field4202 = arg1;
    }

    @OriginalMember(owner = "client!iv", name = "b", descriptor = "(B)I")
    public final int method226(byte arg0) {
        if (arg0 != 13) {
            field8432 = 46;
        }
        ++field8433;
        return 0;
    }

    @OriginalMember(owner = "client!iv", name = "<init>", descriptor = "(Lts;)V")
    public class608(class41 arg0) {
        super(arg0);
    }
}
