import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class420 extends class333 {

    @OriginalMember(owner = "client!ep", name = "p", descriptor = "Ljava/lang/String;")
    public String field5600;

    @OriginalMember(owner = "client!ep", name = "m", descriptor = "Lsb;")
    public static class305 field5597 = new class305(56, 3);

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "I")
    public static int field5595;

    @OriginalMember(owner = "client!ep", name = "n", descriptor = "I")
    public static int field5598;

    @OriginalMember(owner = "client!ep", name = "o", descriptor = "I")
    public static int field5599;

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "[I")
    public static int[] field5596;

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(IIZII)V", line = 3)
    public static final void method2351(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        if (!arg2) {
            return;
        }
        for (int var5 = 0; var5 < class141.field1556; var5++) {
            Rectangle var6 = class275.field3446[var5];
            if (arg0 < (var6.x + var6.width) && var6.x < (arg0 + arg4) && var6.y + var6.height > arg1 && var6.y < arg1 + arg3) {
                class444.field6263[var5] = true;
            }
        }
        field5599++;
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V", line = 27)
    public static void method2352(int arg0) {
        field5596 = null;
        field5597 = null;
        if (arg0 != 56) {
            field5596 = null;
        }
    }

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(Z)Z", line = 45)
    public static final boolean method2353(boolean arg0) {
        field5598++;
        class79 var1 = (class79) class298.field3718.method3434((byte) 2);
        if (var1 == null) {
            return false;
        }
        for (int var2 = 0; var2 < var1.field805; var2++) {
            if (var1.field804[var2] != null && var1.field804[var2].field884 == 0) {
                return false;
            }
            if (var1.field799[var2] != null && var1.field799[var2].field884 == 0) {
                return false;
            }
        }
        if (!arg0) {
            field5596 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!ep", name = "b", descriptor = "(Z)Lkba;", line = 84)
    public static final class575 method2354(boolean arg0) {
        field5595++;
        return arg0 ? class341.method1972((byte) -126, 1) : null;
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "()V", line = 98)
    public class420() {
    }

    @OriginalMember(owner = "client!ep", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 100)
    public class420(String arg0, int arg1) {
        this.field5600 = arg0;
    }
}
