import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class284 extends class539 {

    @OriginalMember(owner = "client!cd", name = "r", descriptor = "I")
    public int field3941;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "I")
    public int field3938;

    @OriginalMember(owner = "client!cd", name = "s", descriptor = "Z")
    public boolean field3942;

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "I")
    public int field3936;

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public int field3937;

    @OriginalMember(owner = "client!cd", name = "p", descriptor = "I")
    public int field3939;

    @OriginalMember(owner = "client!cd", name = "q", descriptor = "I")
    public static int field3940;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIII)V")
    public static final void method1712(int arg0, int arg1, int arg2, int arg3) {
        field3940++;
        int var4 = class274.field3872.field906 * arg3 >> 8;
        if (arg0 != var4 && arg1 != -1) {
            class103.method791(false, arg1, 0, class156.field2360, var4, false);
            class267.field3792 = true;
        }
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(IIIIIZ)V")
    public class284(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field3941 = arg0;
        this.field3938 = arg1;
        this.field3942 = arg5;
        this.field3936 = arg4;
        this.field3937 = arg3;
        this.field3939 = arg2;
    }
}
