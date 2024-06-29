import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class34 extends class595 {

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field624;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "I")
    public static int field625;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "I")
    public static int field627;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public static int field629;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "I")
    public static int field630;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(B)Z")
    public final boolean method297(byte arg0) {
        ++field625;
        if (arg0 >= -119) {
            this.method303(90, -33, -20);
        }
        return true;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IZ)V")
    public final void method299(int arg0, boolean arg1) {
        if (arg0 != -1) {
            this.method302(false, true);
        }
        ++field630;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lbaa;II)V")
    public final void method301(class445 arg0, int arg1, int arg2) {
        if (arg1 == -1) {
            ++field628;
            super.field8612.method2267(2, arg0);
            super.field8612.method2334(arg2, (byte) -127);
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lwr;)V")
    public class34(class388 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(ZZ)V")
    public final void method302(boolean arg0, boolean arg1) {
        ++field626;
        super.field8612.method2294(arg1, (byte) -46);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(III)V")
    public final void method303(int arg0, int arg1, int arg2) {
        if (arg2 <= -114) {
            ++field627;
        }
    }

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "(B)V")
    public final void method298(byte arg0) {
        ++field629;
        super.field8612.method2294(false, (byte) -34);
        if (arg0 != -60) {
            field624 = 26;
        }
    }
}
