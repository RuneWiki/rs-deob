import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class709 extends class139 {

    @OriginalMember(owner = "client!eca", name = "o", descriptor = "I")
    public static int field9907 = -1;

    @OriginalMember(owner = "client!eca", name = "j", descriptor = "I")
    public static int field9902;

    @OriginalMember(owner = "client!eca", name = "k", descriptor = "I")
    public static int field9903;

    @OriginalMember(owner = "client!eca", name = "l", descriptor = "I")
    public static int field9904;

    @OriginalMember(owner = "client!eca", name = "m", descriptor = "I")
    public static int field9905;

    @OriginalMember(owner = "client!eca", name = "n", descriptor = "I")
    public static int field9906;

    @OriginalMember(owner = "client!eca", name = "p", descriptor = "I")
    public static int field9908;

    @OriginalMember(owner = "client!eca", name = "q", descriptor = "I")
    public static int field9909;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(BILgl;)V", line = 4)
    public final void method150(byte arg0, int arg1, class562 arg2) {
        ++field9908;
        super.field1681.method1349(arg2, false);
        if (arg0 <= 103) {
            this.method152(-16);
        }
        super.field1681.method1328((byte) -127, arg1);
    }

    @OriginalMember(owner = "client!eca", name = "<init>", descriptor = "(Lkea;)V", line = 17)
    public class709(class223 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(ZI)V", line = 20)
    public final void method153(boolean arg0, int arg1) {
        ++field9909;
        if (arg1 != 43) {
            field9907 = 94;
        }
        super.field1681.method1284((byte) -109, true);
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(III)V", line = 33)
    public final void method148(int arg0, int arg1, int arg2) {
        ++field9906;
        if (arg0 != -2) {
            this.method148(15, -119, 35);
        }
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(I)V", line = 47)
    public final void method149(int arg0) {
        ++field9905;
        if (arg0 > -4) {
            field9907 = 49;
        }
        super.field1681.method1284((byte) -109, false);
    }

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "(I)Z", line = 58)
    public final boolean method152(int arg0) {
        ++field9902;
        int var2 = -78 / ((50 - arg0) / 48);
        return true;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IZ)V", line = 69)
    public final void method151(int arg0, boolean arg1) {
        if (arg0 == 43) {
            ++field9903;
        }
    }
}
