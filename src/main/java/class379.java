import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eca")
public class class379 {

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "I")
    public static int field5556;

    @OriginalMember(owner = "client!eca", name = "d", descriptor = "I")
    public static int field5559;

    @OriginalMember(owner = "client!eca", name = "e", descriptor = "I")
    public static int field5560;

    @OriginalMember(owner = "client!eca", name = "c", descriptor = "Lqa;")
    public static class167 field5558;

    @OriginalMember(owner = "client!eca", name = "b", descriptor = "Ldda;")
    public static class597 field5557;

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(I)V")
    public static void method2301(int arg0) {
        field5558 = null;
        if (arg0 != 0) {
            field5557 = null;
        }
        field5557 = null;
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIB[I[ILkw;)Lqf;")
    public static final class183 method2302(int arg0, int arg1, byte arg2, int[] arg3, int[] arg4, class174 arg5) {
        if (arg2 != -114) {
            field5558 = null;
        }
        field5556++;
        if (!arg5.method338(false, class629.field9208, class566.field8401)) {
            int[] var10 = new int[arg0 * arg1];
            for (int var11 = 0; var11 < arg0; var11++) {
                int var12 = arg1 * var11 + arg4[var11];
                for (int var13 = 0; var13 < arg3[var11]; var13++) {
                    var10[var12++] = -16777216;
                }
            }
            return new class183(arg5, arg1, arg0, var10);
        }
        byte[] var6 = new byte[arg0 * arg1];
        for (int var7 = 0; var7 < arg0; var7++) {
            int var8 = arg1 * var7 + arg4[var7];
            for (int var9 = 0; var9 < arg3[var7]; var9++) {
                var6[var8++] = -1;
            }
        }
        return new class183(arg5, arg1, arg0, var6);
    }

    @OriginalMember(owner = "client!eca", name = "a", descriptor = "(IIIII)V")
    public static final void method2303(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5559++;
        if ((arg0 - arg1) >= class130.field1712 && arg0 + arg1 <= class401.field5755 && (arg4 - arg1) >= class483.field7334 && arg4 + arg1 <= class202.field3021) {
            class57.method364(arg4, arg0, (byte) -67, arg3, arg1);
        } else {
            class642.method3719(arg4, arg0, arg3, arg1, -58);
        }
        if (arg2 < 89) {
            field5557 = null;
        }
    }
}
