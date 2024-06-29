import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public abstract class class619 extends class224 {

    @OriginalMember(owner = "client!of", name = "A", descriptor = "I")
    public int field8938;

    @OriginalMember(owner = "client!of", name = "y", descriptor = "I")
    public static int field8936 = 1406;

    @OriginalMember(owner = "client!of", name = "z", descriptor = "Z")
    public static boolean field8937 = true;

    @OriginalMember(owner = "client!of", name = "x", descriptor = "I")
    public static int field8935;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IIII)V")
    public static final void method3581(int arg0, int arg1, int arg2, int arg3) {
        field8935++;
        class354 var4 = class501.method3012(arg2, 9, arg3 ^ 0x7FE92442);
        var4.method2222(-97);
        var4.field4990 = arg1;
        var4.field4980 = arg0;
        if (arg3 != 30178) {
            field8937 = true;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(I)Z")
    public abstract boolean method1999(int arg0);

    @OriginalMember(owner = "client!of", name = "h", descriptor = "(I)Ljava/lang/Object;")
    public abstract Object method2001(int arg0);

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "(I)V")
    public class619(int arg0) {
        this.field8938 = arg0;
    }
}
