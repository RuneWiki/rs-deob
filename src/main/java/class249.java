import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cca")
public abstract class class249 {

    @OriginalMember(owner = "client!cca", name = "c", descriptor = "Lwh;")
    public class148 field3613;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3611 = null;

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "I")
    public static int field3612 = -1;

    @OriginalMember(owner = "client!cca", name = "d", descriptor = "I")
    public static int field3614;

    @OriginalMember(owner = "client!cca", name = "e", descriptor = "I")
    public static int field3615;

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(III)V")
    public abstract void method607(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(ZZ)V")
    public abstract void method608(boolean arg0, boolean arg1);

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(I)Z")
    public abstract boolean method605(int arg0);

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(Lme;ZI)V")
    public abstract void method603(class195 arg0, boolean arg1, int arg2);

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "(I)V")
    public abstract void method611(int arg0);

    @OriginalMember(owner = "client!cca", name = "<init>", descriptor = "(Lwh;)V")
    public class249(class148 arg0) {
        this.field3613 = arg0;
    }

    @OriginalMember(owner = "client!cca", name = "a", descriptor = "(IZ)V")
    public abstract void method610(int arg0, boolean arg1);

    @OriginalMember(owner = "client!cca", name = "c", descriptor = "(I)V")
    public static void method1647(int arg0) {
        field3611 = null;
        int var1 = 104 % ((arg0 + 53) / 32);
    }

    @OriginalMember(owner = "client!cca", name = "b", descriptor = "(III)V")
    public static final void method1648(int arg0, int arg1, int arg2) {
        if (arg2 > -125) {
            field3615 = -31;
        }
        if (class457.field6743 == 1) {
            class351.method2212(arg1, (byte) -18, class760.field10609, arg0);
        } else if (class457.field6743 == 2) {
            if (class419.field6265) {
                class355.method2219(-52, arg0 + class210.method1422(true), arg1 - -class407.method2589((byte) -45));
            } else {
                class355.method2219(70, arg0, arg1);
            }
        }
        field3614++;
        class457.field6743 = 0;
        class760.field10609 = null;
    }
}
