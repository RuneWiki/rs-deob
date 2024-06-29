import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mi")
public class class495 extends class486 {

    @OriginalMember(owner = "client!mi", name = "e", descriptor = "[I")
    public int[] field7126;

    @OriginalMember(owner = "client!mi", name = "g", descriptor = "[I")
    public int[] field7128;

    @OriginalMember(owner = "client!mi", name = "f", descriptor = "I")
    public static int field7127;

    @OriginalMember(owner = "client!mi", name = "h", descriptor = "I")
    public static int field7129;

    @OriginalMember(owner = "client!mi", name = "<init>", descriptor = "(II[I[I)V")
    public class495(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field7126 = arg2;
        this.field7128 = arg3;
    }

    @OriginalMember(owner = "client!mi", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method2961(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7127++;
        int var6 = arg2;
        int var7 = -118 % ((-arg5 - 19) / 57);
        while (arg4 >= var6) {
            for (int var8 = arg0; var8 <= arg1; var8++) {
                if (class662.field9064[var6][var8] == arg3 && class115.field1388[var6][var8] <= 1) {
                    return true;
                }
            }
            var6++;
        }
        return false;
    }
}
