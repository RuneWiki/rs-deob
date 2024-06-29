import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kv")
public class class284 extends class779 {

    @OriginalMember(owner = "client!kv", name = "v", descriptor = "Z")
    public static volatile boolean field3931 = true;

    @OriginalMember(owner = "client!kv", name = "n", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!kv", name = "p", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!kv", name = "q", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!kv", name = "r", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!kv", name = "s", descriptor = "I")
    public static int field3928;

    @OriginalMember(owner = "client!kv", name = "t", descriptor = "I")
    public static int field3929;

    @OriginalMember(owner = "client!kv", name = "u", descriptor = "I")
    public static int field3930;

    @OriginalMember(owner = "client!kv", name = "o", descriptor = "Lnf;")
    private class604 field3924;

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(II)Z")
    public static final boolean method1824(int arg0, int arg1) {
        ++field3930;
        if (arg0 <= 82) {
            field3931 = false;
        }
        return ~arg1 == -1 || arg1 == 2;
    }

    @OriginalMember(owner = "client!kv", name = "b", descriptor = "(Z)V")
    public static final void method1825(boolean arg0) {
        ++field3925;
        class687.field9553.method273(-123);
        if (arg0) {
            field3931 = false;
        }
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(I)V")
    public final void method1790(int arg0) {
        super.method1790(arg0);
        ++field3927;
        this.field3924 = class265.method1731(((class37) super.field10732).field634, 65485, super.field10741);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(ZZII)V")
    public final void method1826(boolean arg0, boolean arg1, int arg2, int arg3) {
        ++field3928;
        if (arg0) {
            this.method1789((byte) -38);
        }
        class95.field1472.method519(arg3 + -2, arg2, super.field10732.field1031 + 4, super.field10732.field1030 + 2, ((class37) super.field10732).field632, 0);
        class95.field1472.method519(arg3 - 1, arg2 + 1, super.field10732.field1031 + 2, super.field10732.field1030, 0, 0);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(B)Z")
    public final boolean method1789(byte arg0) {
        ++field3929;
        return !super.method1789(arg0) ? false : super.field10741.method3737(((class37) super.field10732).field634, false);
    }

    @OriginalMember(owner = "client!kv", name = "<init>", descriptor = "(Lgj;Lgj;Lwv;)V")
    public class284(class662 arg0, class662 arg1, class37 arg2) {
        super(arg0, arg1, arg2);
    }

    @OriginalMember(owner = "client!kv", name = "a", descriptor = "(IIIZ)V")
    public final void method1827(int arg0, int arg1, int arg2, boolean arg3) {
        ++field3923;
        int var5 = this.method4270(38) * super.field10732.field1031 / 10000;
        int[] var6 = new int[4];
        class95.field1472.method580(var6);
        class95.field1472.method512(arg2, arg1 + 2, arg2 + var5, super.field10732.field1030 + arg1);
        this.field3924.method3426(arg2, arg1 + 2, super.field10732.field1031, super.field10732.field1030);
        class95.field1472.method512(var6[arg0], var6[1], var6[2], var6[3]);
    }
}
