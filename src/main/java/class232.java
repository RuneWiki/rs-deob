import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class232 {

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "Z")
    public boolean field3848 = true;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public int field3851;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "I")
    public int field3844;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public int field3842;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "I")
    public int field3854;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public int field3852;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public int field3845;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field3847 = -1;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "[I")
    public static int[] field3853 = new int[] { 76, 8, 137, 4, 0, 1, 38, 2, 19 };

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "Ljl;")
    public static class332 field3843 = new class332(5);

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    public static int field3856 = 0;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "I")
    public static int field3849;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "Z")
    public static boolean field3855;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V", line = 9)
    public static void method1788(byte arg0) {
        if (arg0 > -121) {
            field3856 = -22;
        }
        field3853 = null;
        field3843 = null;
    }

    @OriginalMember(owner = "client!tb", name = "<init>", descriptor = "(IIIIIIZ)V", line = 73)
    public class232(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field3851 = arg3;
        this.field3844 = arg0;
        this.field3842 = arg4;
        this.field3854 = arg5;
        this.field3852 = arg2;
        this.field3848 = arg6;
        this.field3845 = arg1;
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(Z)V", line = 30)
    public static final void method1789(boolean arg0) {
        class163.field2587 = new class250[class258.field4344.method489(17752)][];
        class78.field1348 = new boolean[class258.field4344.method489(17752)];
        if (arg0) {
            field3850++;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(II)I", line = 43)
    public static final int method1790(int arg0, int arg1) {
        if (arg1 != 137) {
            method1789(true);
        }
        field3846++;
        if (arg0 > 0) {
            return 1;
        } else if (arg0 < 0) {
            return -1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V", line = 64)
    public static final void method1791(int arg0) {
        field3849++;
        class329.field5229 = new class164(32);
        int var1 = 56 / ((-arg0 - 55) / 40);
    }
}
