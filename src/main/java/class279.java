import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mda")
public class class279 implements class515 {

    @OriginalMember(owner = "client!mda", name = "e", descriptor = "Luo;")
    private class603 field3853;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "Lfja;")
    public static class783 field3849 = new class783(81, 10);

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!mda", name = "c", descriptor = "I")
    public static int field3851;

    @OriginalMember(owner = "client!mda", name = "d", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!mda", name = "f", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(Z)V")
    public static final void method1787(boolean arg0) {
        field3854++;
        if (arg0) {
            class495.method2841(-1, 16, 255);
        }
    }

    @OriginalMember(owner = "client!mda", name = "b", descriptor = "(B)V")
    public static void method1788(byte arg0) {
        if (arg0 != -122) {
            field3849 = null;
        }
        field3849 = null;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(B)Z")
    public final boolean method1789(byte arg0) {
        field3852++;
        if (arg0 != 29) {
            this.method1790(53);
        }
        return true;
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(I)V")
    public final void method1790(int arg0) {
        field3851++;
        if (arg0 != 6187) {
            this.field3853 = null;
        }
    }

    @OriginalMember(owner = "client!mda", name = "a", descriptor = "(ZI)V")
    public final void method1102(boolean arg0, int arg1) {
        field3850++;
        if (arg1 != 1164) {
            this.field3853 = null;
        }
        if (arg0) {
            class95.field1472.method537(0, 0, class732.field10098, class108.field1697, this.field3853.field8437, 0);
        }
    }

    @OriginalMember(owner = "client!mda", name = "<init>", descriptor = "(Luo;)V")
    public class279(class603 arg0) {
        this.field3853 = arg0;
    }
}
