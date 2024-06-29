import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class659 extends class530 {

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "Lju;")
    public static class102 field9304 = new class102(16, 3);

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "Z")
    public static boolean field9305 = false;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    public static int field9306 = -1;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public static int field9299;

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static int field9300;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "I")
    public static int field9301;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "I")
    public static int field9302;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "I")
    public static int field9303;

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V")
    public static void method3797(int arg0) {
        if (arg0 == 16) {
            field9304 = null;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)I")
    public final int method75(int arg0, int arg1) {
        ++field9303;
        int var3 = -8 / ((arg1 - 63) / 60);
        return 3;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(Z)V")
    public final void method73(boolean arg0) {
        super.field7419 = this.method74(0);
        if (arg0) {
            ++field9300;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)I")
    public final int method74(int arg0) {
        ++field9299;
        if (arg0 != 0) {
            this.method3798(107);
        }
        return super.field7418.method2246(arg0 ^ 1) == class75.field1037 && super.field7418.method2253(arg0 + 125) ? 0 : 1;
    }

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "(I)I")
    public final int method3798(int arg0) {
        ++field9302;
        if (arg0 != 0) {
            field9306 = 40;
        }
        return super.field7419;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(ILah;)V")
    public class659(int arg0, class374 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)V")
    public final void method70(int arg0, int arg1) {
        if (arg1 <= -38) {
            super.field7419 = arg0;
            ++field9301;
        }
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "(Lah;)V")
    public class659(class374 arg0) {
        super(arg0);
    }
}
