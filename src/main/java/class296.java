import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class296 extends class205 {

    @OriginalMember(owner = "client!ll", name = "r", descriptor = "I")
    public static int field3655 = 1406;

    @OriginalMember(owner = "client!ll", name = "t", descriptor = "Z")
    public static boolean field3657 = false;

    @OriginalMember(owner = "client!ll", name = "v", descriptor = "[I")
    public static int[] field3659 = new int[64];

    @OriginalMember(owner = "client!ll", name = "w", descriptor = "Z")
    public static boolean field3660 = false;

    @OriginalMember(owner = "client!ll", name = "s", descriptor = "I")
    public static int field3656;

    @OriginalMember(owner = "client!ll", name = "u", descriptor = "I")
    public static int field3658;

    @OriginalMember(owner = "client!ll", name = "x", descriptor = "I")
    public static int field3661;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(IIZI)V", line = 3)
    public final void method1240(int arg0, int arg1, boolean arg2, int arg3) {
        ++field3656;
        int var5 = this.method1242((byte) -8) * super.field2603.field1621 / 10000;
        class32.field452.method1090(arg3, arg1 + 2, var5, super.field2603.field1617 + -2, ((class158) super.field2603).field2056, 0);
        class32.field452.method1090(arg3 - -var5, arg0 + arg1, -var5 + super.field2603.field1621, super.field2603.field1617 + -2, 0, 0);
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIZI)V", line = 20)
    public final void method1239(int arg0, int arg1, boolean arg2, int arg3) {
        int var5 = 108 % ((arg0 - 50) / 49);
        ++field3658;
        class32.field452.method978(arg1 + -2, arg3, super.field2603.field1621 - -4, super.field2603.field1617 + 2, ((class158) super.field2603).field2055, 0);
        class32.field452.method978(arg1 - 1, arg3 + 1, super.field2603.field1621 + 2, super.field2603.field1617, 0, 0);
    }

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "(B)V", line = 32)
    public static void method1652(byte arg0) {
        if (arg0 == -83) {
            field3659 = null;
        }
    }

    @OriginalMember(owner = "client!ll", name = "<init>", descriptor = "(Lpl;Lpl;Lkk;)V", line = 48)
    public class296(class612 arg0, class612 arg1, class158 arg2) {
        super(arg0, arg1, arg2);
    }
}
