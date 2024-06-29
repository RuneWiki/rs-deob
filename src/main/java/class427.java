import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class427 extends class192 implements class458 {

    @OriginalMember(owner = "client!gl", name = "q", descriptor = "I")
    private int field6072;

    @OriginalMember(owner = "client!gl", name = "n", descriptor = "Z")
    public static boolean field6069 = false;

    @OriginalMember(owner = "client!gl", name = "j", descriptor = "I")
    public static int field6065;

    @OriginalMember(owner = "client!gl", name = "k", descriptor = "I")
    public static int field6066;

    @OriginalMember(owner = "client!gl", name = "l", descriptor = "I")
    public static int field6067;

    @OriginalMember(owner = "client!gl", name = "m", descriptor = "I")
    public static int field6068;

    @OriginalMember(owner = "client!gl", name = "o", descriptor = "I")
    public static int field6070;

    @OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
    public static int field6071;

    @OriginalMember(owner = "client!gl", name = "r", descriptor = "I")
    public static int field6073;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)I")
    public final int method2501(byte arg0) {
        ++field6070;
        if (arg0 != -58) {
            this.method2503(-35);
        }
        return this.field6072;
    }

    @OriginalMember(owner = "client!gl", name = "c", descriptor = "(I)V")
    public final void method1188(int arg0) {
        ++field6071;
        if (arg0 == 32299) {
            super.field2494.method2275(this, true);
        }
    }

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "(B)I")
    public final int method2502(byte arg0) {
        ++field6068;
        int var2 = -103 / ((arg0 - -55) / 52);
        return super.field2493;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(I)J")
    public final long method2503(int arg0) {
        if (arg0 > -31) {
            field6065 = 11;
        }
        ++field6066;
        return 0L;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)V")
    public static final void method2504(int arg0, int arg1, int arg2) {
        ++field6073;
        class9.field144 = -class241.field3112 + arg2;
        if (arg0 != 34963) {
            field6069 = true;
        }
        class179.field2366 = -class241.field3119 + arg1;
    }

    @OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(Lug;I[BIZ)V")
    public class427(class395 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field6072 = arg1;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(III[B)V")
    public final void method2505(int arg0, int arg1, int arg2, byte[] arg3) {
        this.method1189(-29783, arg2, arg3);
        ++field6067;
        this.field6072 = arg0;
        if (arg1 != 6538) {
            this.method1188(75);
        }
    }
}
