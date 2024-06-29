import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class261 extends class544 {

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public int field3370 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public int field3374 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public int field3371 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!cd", name = "t", descriptor = "I")
    public int field3376 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!cd", name = "u", descriptor = "I")
    public int field3377 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!cd", name = "v", descriptor = "I")
    public int field3378 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "I")
    public int field3375 = Integer.MAX_VALUE;

    @OriginalMember(owner = "client!cd", name = "w", descriptor = "I")
    public int field3379 = Integer.MIN_VALUE;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "Lwt;")
    public class258 field3373;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "F")
    public static float field3369;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(III)Z")
    public final boolean method1465(int arg0, int arg1, int arg2) {
        field3372++;
        if (arg0 >= this.field3376 && arg0 <= this.field3370 && arg2 >= this.field3377 && this.field3374 >= arg2) {
            return true;
        } else if (this.field3378 <= arg0 && arg0 <= this.field3379 && arg2 >= this.field3375 && this.field3371 >= arg2) {
            return true;
        } else {
            int var4 = 49 / ((-arg1 - 1) / 33);
            return false;
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Lwt;)V")
    public class261(class258 arg0) {
        this.field3373 = arg0;
    }
}
