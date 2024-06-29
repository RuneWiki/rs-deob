import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wo")
public class class690 extends class426 implements class116 {

    @OriginalMember(owner = "client!wo", name = "t", descriptor = "I")
    private int field9789;

    @OriginalMember(owner = "client!wo", name = "p", descriptor = "[I")
    public static int[] field9785 = new int[5];

    @OriginalMember(owner = "client!wo", name = "y", descriptor = "I")
    public static int field9794 = 1339;

    @OriginalMember(owner = "client!wo", name = "v", descriptor = "[I")
    public static int[] field9791 = new int[64];

    @OriginalMember(owner = "client!wo", name = "o", descriptor = "I")
    public static int field9784;

    @OriginalMember(owner = "client!wo", name = "q", descriptor = "I")
    public static int field9786;

    @OriginalMember(owner = "client!wo", name = "s", descriptor = "I")
    public static int field9788;

    @OriginalMember(owner = "client!wo", name = "u", descriptor = "I")
    public static int field9790;

    @OriginalMember(owner = "client!wo", name = "w", descriptor = "I")
    public static int field9792;

    @OriginalMember(owner = "client!wo", name = "x", descriptor = "I")
    public static int field9793;

    @OriginalMember(owner = "client!wo", name = "r", descriptor = "[Ltd;")
    public static class515[] field9787;

    @OriginalMember(owner = "client!wo", name = "b", descriptor = "(I)V")
    public static void method3902(int arg0) {
        field9785 = null;
        field9791 = null;
        if (arg0 != 20618) {
            field9785 = null;
        }
        field9787 = null;
    }

    @OriginalMember(owner = "client!wo", name = "<init>", descriptor = "(Lkw;I[BIZ)V")
    public class690(class346 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field9789 = arg1;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(Z)I")
    public final int method822(boolean arg0) {
        ++field9792;
        if (arg0) {
            this.method822(true);
        }
        return this.field9789;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(I)J")
    public final long method820(int arg0) {
        ++field9786;
        if (arg0 != 23579) {
            method3903(87, -76);
        }
        return 0L;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(B)I")
    public final int method823(byte arg0) {
        ++field9793;
        if (arg0 > -55) {
            this.method1109(-32);
        }
        return super.field6153;
    }

    @OriginalMember(owner = "client!wo", name = "e", descriptor = "(I)V")
    public final void method1109(int arg0) {
        ++field9790;
        super.field6157.method2125(false, this);
        if (arg0 > -40) {
            this.method821(86, 92, (byte[]) null, (byte) 78);
        }
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(II[BB)V")
    public final void method821(int arg0, int arg1, byte[] arg2, byte arg3) {
        this.method2650(arg2, arg0, 24637);
        if (arg3 != -64) {
            field9785 = null;
        }
        ++field9784;
        this.field9789 = arg1;
    }

    @OriginalMember(owner = "client!wo", name = "a", descriptor = "(II)I")
    public static final int method3903(int arg0, int arg1) {
        ++field9788;
        int var2 = 0;
        if (~arg1 > -1 || arg1 >= 65536) {
            arg1 >>>= 16;
            var2 += 16;
        }
        if (~arg1 <= -257) {
            arg1 >>>= 8;
            var2 += 8;
        }
        if (arg1 >= 16) {
            var2 += 4;
            arg1 >>>= 4;
        }
        if (arg1 >= arg0) {
            var2 += 2;
            arg1 >>>= 2;
        }
        if (~arg1 <= -2) {
            arg1 >>>= 1;
            ++var2;
        }
        return arg1 + var2;
    }
}
