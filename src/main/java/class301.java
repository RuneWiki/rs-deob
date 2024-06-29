import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mk")
public abstract class class301 {

    @OriginalMember(owner = "client!mk", name = "d", descriptor = "Lck;")
    public class733 field3803;

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "I")
    public static int field3801 = 0;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "F")
    public static float field3800;

    @OriginalMember(owner = "client!mk", name = "c", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!mk", name = "e", descriptor = "[[[Z")
    public static boolean[][][] field3804;

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(I)V", line = 3)
    public static void method1791(int arg0) {
        if (arg0 == 0) {
            field3804 = null;
        }
    }

    @OriginalMember(owner = "client!mk", name = "<init>", descriptor = "(Lck;)V", line = 22)
    public class301(class733 arg0) {
        this.field3803 = arg0;
    }

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(Lwj;II)V")
    public abstract void method28(class128 arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(IZ)V")
    public abstract void method29(int arg0, boolean arg1);

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(B)Z")
    public abstract boolean method25(byte arg0);

    @OriginalMember(owner = "client!mk", name = "a", descriptor = "(III)V")
    public abstract void method22(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(B)V")
    public abstract void method24(byte arg0);

    @OriginalMember(owner = "client!mk", name = "b", descriptor = "(IZ)V")
    public abstract void method27(int arg0, boolean arg1);
}
