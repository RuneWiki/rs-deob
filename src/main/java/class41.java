import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class41 extends class381 {

    @OriginalMember(owner = "client!lj", name = "q", descriptor = "S")
    public short field633;

    @OriginalMember(owner = "client!lj", name = "n", descriptor = "I")
    public static int field630 = 0;

    @OriginalMember(owner = "client!lj", name = "m", descriptor = "F")
    public static float field629;

    @OriginalMember(owner = "client!lj", name = "l", descriptor = "I")
    public static int field628;

    @OriginalMember(owner = "client!lj", name = "o", descriptor = "I")
    public static int field631;

    @OriginalMember(owner = "client!lj", name = "p", descriptor = "I")
    public static int field632;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIIII)V", line = 7)
    public static final void method398(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class433.field6144 <= arg4 && arg4 <= class69.field1047) {
            int var5 = class359.method2251(class134.field1917, arg2, 114, class39.field595);
            int var6 = class359.method2251(class134.field1917, arg3, 112, class39.field595);
            class434.method2693(var5, var6, arg1, arg4, -30616);
        }
        field631++;
        if (arg0 != 0) {
            field629 = -0.059084263F;
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(Z)I", line = 25)
    public static final int method399(boolean arg0) {
        if (arg0) {
            field629 = -0.49788606F;
        }
        field632++;
        return 15;
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "()V", line = 41)
    public class41() {
    }

    @OriginalMember(owner = "client!lj", name = "<init>", descriptor = "(S)V", line = 43)
    public class41(short arg0) {
        this.field633 = arg0;
    }
}
