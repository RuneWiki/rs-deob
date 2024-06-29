import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class390 {

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "I")
    public static int field5000;

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II[IBI)V", line = 8)
    public static final void method2223(int arg0, int arg1, int[] arg2, byte arg3, int arg4) {
        arg0--;
        field5000++;
        if (arg3 >= -60) {
            return;
        }
        int var13 = arg4 - 1;
        int var5 = var13 - 7;
        while (arg0 < var5) {
            int var6 = arg0 + 1;
            arg2[var6] = arg1;
            int var7 = var6 + 1;
            arg2[var7] = arg1;
            int var8 = var7 + 1;
            arg2[var8] = arg1;
            int var9 = var8 + 1;
            arg2[var9] = arg1;
            int var10 = var9 + 1;
            arg2[var10] = arg1;
            int var11 = var10 + 1;
            arg2[var11] = arg1;
            int var12 = var11 + 1;
            arg2[var12] = arg1;
            arg0 = var12 + 1;
            arg2[arg0] = arg1;
        }
        while (var13 > arg0) {
            arg0++;
            arg2[arg0] = arg1;
        }
    }
}
