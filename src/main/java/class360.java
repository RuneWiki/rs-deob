import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class360 implements class389 {

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "Lpga;")
    private class153 field5012;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
    public static int field5011;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "I")
    public static int field5013;

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "I")
    public static int field5014;

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)Z", line = 3)
    public final boolean method348(int arg0) {
        field5014++;
        if (arg0 != 21378) {
            this.field5012 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZZ)V", line = 14)
    public final void method344(boolean arg0, boolean arg1) {
        if (arg1) {
            class637.field9048.method824(0, 0, class465.field6689, class597.field8633, this.field5012.field2545, 0);
        }
        field5013++;
        if (arg0) {
            this.method344(true, false);
        }
    }

    @OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lpga;)V", line = 30)
    public class360(class153 arg0) {
        this.field5012 = arg0;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V", line = 40)
    public final void method343(int arg0) {
        field5011++;
        if (arg0 >= -29) {
            this.method344(false, false);
        }
    }
}
