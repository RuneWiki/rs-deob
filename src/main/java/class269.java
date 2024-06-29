import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class269 extends class204 {

    @OriginalMember(owner = "client!cp", name = "o", descriptor = "Z")
    public static boolean field3898 = false;

    @OriginalMember(owner = "client!cp", name = "n", descriptor = "Lo;")
    public static class208 field3897 = new class208(1, 2, 2, 0);

    @OriginalMember(owner = "client!cp", name = "q", descriptor = "Lqk;")
    public static class1 field3900 = new class1(69, 4);

    @OriginalMember(owner = "client!cp", name = "h", descriptor = "I")
    public static int field3891;

    @OriginalMember(owner = "client!cp", name = "i", descriptor = "I")
    public static int field3892;

    @OriginalMember(owner = "client!cp", name = "j", descriptor = "I")
    public static int field3893;

    @OriginalMember(owner = "client!cp", name = "k", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!cp", name = "l", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!cp", name = "m", descriptor = "I")
    public static int field3896;

    @OriginalMember(owner = "client!cp", name = "p", descriptor = "I")
    public static int field3899;

    @OriginalMember(owner = "client!cp", name = "r", descriptor = "Lae;")
    public static class283 field3901;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(II)I")
    public final int method487(int arg0, int arg1) {
        int var3 = -36 / ((arg1 - -57) / 60);
        ++field3892;
        return 3;
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(ILfs;)V")
    public class269(int arg0, class607 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!cp", name = "c", descriptor = "(I)V")
    public static void method1754(int arg0) {
        if (arg0 > 86) {
            field3901 = null;
            field3900 = null;
            field3897 = null;
        }
    }

    @OriginalMember(owner = "client!cp", name = "d", descriptor = "(II)V")
    public final void method488(int arg0, int arg1) {
        super.field2852 = arg0;
        if (arg1 >= -105) {
            this.method486(52);
        }
        ++field3896;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILrh;)I")
    public static final int method1755(int arg0, class718 arg1) {
        ++field3895;
        if (class748.field10326 != arg1) {
            if (class444.field6143 != arg1) {
                if (class543.field7565 == arg1) {
                    return 34066;
                } else {
                    if (arg0 >= -124) {
                        method1754(65);
                    }
                    throw new IllegalArgumentException();
                }
            } else {
                return 34065;
            }
        } else {
            return 9216;
        }
    }

    @OriginalMember(owner = "client!cp", name = "b", descriptor = "(B)I")
    public final int method1756(byte arg0) {
        if (arg0 != -98) {
            field3893 = -111;
        }
        ++field3894;
        return super.field2852;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(I)V")
    public final void method486(int arg0) {
        super.field2852 = this.method490((byte) 109);
        ++field3899;
        if (arg0 != -4591) {
            field3900 = null;
        }
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "(Lfs;)V")
    public class269(class607 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(B)I")
    public final int method490(byte arg0) {
        if (arg0 < 83) {
            return 5;
        } else {
            ++field3891;
            return super.field2853.method3510(-82) == class692.field9661 && super.field2853.method3505(127) ? 0 : 1;
        }
    }
}
