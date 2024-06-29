import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class249 extends class530 {

    @OriginalMember(owner = "client!lp", name = "n", descriptor = "Lju;")
    public static class102 field3470 = new class102(4, 6);

    @OriginalMember(owner = "client!lp", name = "g", descriptor = "I")
    public static int field3463;

    @OriginalMember(owner = "client!lp", name = "h", descriptor = "I")
    public static int field3464;

    @OriginalMember(owner = "client!lp", name = "i", descriptor = "I")
    public static int field3465;

    @OriginalMember(owner = "client!lp", name = "j", descriptor = "I")
    public static int field3466;

    @OriginalMember(owner = "client!lp", name = "k", descriptor = "I")
    public static int field3467;

    @OriginalMember(owner = "client!lp", name = "l", descriptor = "I")
    public static int field3468;

    @OriginalMember(owner = "client!lp", name = "m", descriptor = "I")
    public static int field3469;

    @OriginalMember(owner = "client!lp", name = "o", descriptor = "I")
    public static int field3471;

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(I)I")
    public final int method1586(int arg0) {
        if (arg0 != 0) {
            this.method1586(-10);
        }
        ++field3466;
        return super.field7419;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(II)I")
    public final int method75(int arg0, int arg1) {
        ++field3467;
        int var3 = 82 / ((arg1 - 63) / 60);
        return 1;
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(II)V")
    public final void method70(int arg0, int arg1) {
        if (arg1 < -38) {
            super.field7419 = arg0;
            ++field3463;
        }
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(B)V")
    public static void method1587(byte arg0) {
        if (arg0 != -94) {
            field3470 = null;
        }
        field3470 = null;
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(Z)V")
    public final void method73(boolean arg0) {
        if (arg0) {
            if (super.field7419 != 1 && ~super.field7419 != -1) {
                super.field7419 = this.method74(0);
            }
            ++field3468;
        }
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(Lah;)V")
    public class249(class374 arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!lp", name = "b", descriptor = "(III)Z")
    public static final boolean method1588(int arg0, int arg1, int arg2) {
        if (arg0 != 15675) {
            method1588(-11, 69, 21);
        }
        ++field3471;
        return class526.method3135((byte) -113, arg1, arg2) | (arg2 & 393216) != 0 || class164.method1020(-1, arg1, arg2) || class676.method3875(arg1, -113, arg2);
    }

    @OriginalMember(owner = "client!lp", name = "a", descriptor = "(I)I")
    public final int method74(int arg0) {
        if (arg0 != 0) {
            return 67;
        } else {
            ++field3465;
            return 1;
        }
    }

    @OriginalMember(owner = "client!lp", name = "<init>", descriptor = "(ILah;)V")
    public class249(int arg0, class374 arg1) {
        super(arg0, arg1);
    }
}
