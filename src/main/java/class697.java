import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gv")
public class class697 {

    @OriginalMember(owner = "client!gv", name = "c", descriptor = "I")
    private int field9842;

    @OriginalMember(owner = "client!gv", name = "f", descriptor = "Lwq;")
    private class674 field9845;

    @OriginalMember(owner = "client!gv", name = "h", descriptor = "I")
    public int field9847;

    @OriginalMember(owner = "client!gv", name = "d", descriptor = "I")
    public int field9843;

    @OriginalMember(owner = "client!gv", name = "i", descriptor = "Lgv;")
    public static class697 field9848 = new class697(0, 3, class674.field9594);

    @OriginalMember(owner = "client!gv", name = "j", descriptor = "Lgv;")
    public static class697 field9849 = new class697(1, 3, class674.field9594);

    @OriginalMember(owner = "client!gv", name = "k", descriptor = "Lgv;")
    public static class697 field9850 = new class697(2, 4, class674.field9590);

    @OriginalMember(owner = "client!gv", name = "l", descriptor = "Lgv;")
    public static class697 field9851 = new class697(3, 1, class674.field9594);

    @OriginalMember(owner = "client!gv", name = "m", descriptor = "Lgv;")
    public static class697 field9852 = new class697(4, 2, class674.field9594);

    @OriginalMember(owner = "client!gv", name = "n", descriptor = "Lgv;")
    public static class697 field9853 = new class697(5, 3, class674.field9594);

    @OriginalMember(owner = "client!gv", name = "o", descriptor = "Lgv;")
    public static class697 field9854 = new class697(6, 4, class674.field9594);

    @OriginalMember(owner = "client!gv", name = "p", descriptor = "I")
    public static int field9855 = class690.method3903(4, 16);

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "I")
    public static int field9840;

    @OriginalMember(owner = "client!gv", name = "b", descriptor = "I")
    public static int field9841;

    @OriginalMember(owner = "client!gv", name = "e", descriptor = "I")
    public static int field9844;

    @OriginalMember(owner = "client!gv", name = "g", descriptor = "I")
    public static int field9846;

    @OriginalMember(owner = "client!gv", name = "q", descriptor = "I")
    public static int field9856;

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(IZ)Lgv;")
    public static final class697 method3920(int arg0, boolean arg1) {
        field9840++;
        if (arg0 == 0) {
            return field9848;
        } else if (arg0 == 1) {
            return field9849;
        } else if (arg0 == 2) {
            return field9850;
        } else if (arg0 == 3) {
            return field9851;
        } else if (arg0 == 4) {
            return field9852;
        } else if (arg0 == 5) {
            return field9853;
        } else if (arg0 == 6) {
            return field9854;
        } else {
            if (!arg1) {
                method3921(true, -3);
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(ZI)Z")
    public static final boolean method3921(boolean arg0, int arg1) {
        field9846++;
        if (!arg0) {
            method3922(true);
        }
        return arg1 >= 4 && arg1 <= 8;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(Z)V")
    public static void method3922(boolean arg0) {
        if (arg0) {
            return;
        }
        field9853 = null;
        field9854 = null;
        field9848 = null;
        field9849 = null;
        field9850 = null;
        field9851 = null;
        field9852 = null;
    }

    @OriginalMember(owner = "client!gv", name = "a", descriptor = "(II)Z")
    public static final boolean method3923(int arg0, int arg1) {
        field9844++;
        if (arg1 != 5626) {
            field9848 = null;
        }
        return arg0 == 3 || arg0 == 4;
    }

    @OriginalMember(owner = "client!gv", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9841++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!gv", name = "<init>", descriptor = "(IILwq;)V")
    private class697(int arg0, int arg1, class674 arg2) {
        this.field9842 = arg1;
        this.field9845 = arg2;
        this.field9847 = arg0;
        this.field9843 = this.field9845.field9586 * this.field9842;
        if (this.field9847 >= 16) {
            throw new RuntimeException();
        }
    }
}
