import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fv")
public class class133 {

    @OriginalMember(owner = "client!fv", name = "c", descriptor = "[I")
    public static int[] field2279 = new int[13];

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "I")
    public static int field2277;

    @OriginalMember(owner = "client!fv", name = "b", descriptor = "I")
    public static int field2278;

    @OriginalMember(owner = "client!fv", name = "d", descriptor = "I")
    public static int field2280;

    @OriginalMember(owner = "client!fv", name = "e", descriptor = "[Lmb;")
    public static class277[] field2281;

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(B)V", line = 27)
    public static void method1109(byte arg0) {
        if (arg0 != -102) {
            method1111(null, 127, -76, null, -94, 57);
        }
        field2279 = null;
        field2281 = null;
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(II[S)[S", line = 49)
    public static final short[] method1110(int arg0, int arg1, short[] arg2) {
        field2277++;
        short[] var3 = new short[arg0];
        if (arg1 == -2624) {
            class275.method1776(arg2, 0, var3, 0, arg0);
            return var3;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!fv", name = "a", descriptor = "(Lij;IILha;II)V", line = 71)
    public static final void method1111(class445 arg0, int arg1, int arg2, class66 arg3, int arg4, int arg5) {
        field2280++;
        class6 var6 = class636.field8785.method2119(arg0.field6027, (byte) 33);
        if (var6.field111 == -1) {
            return;
        }
        int var8;
        if (arg0.field6044) {
            int var7 = arg0.field6098 + arg1;
            var8 = var7 & 0x3;
        } else {
            var8 = 0;
        }
        class604 var9 = var6.method44(arg3, 0, arg0.field6099, var8);
        if (var9 == null) {
            return;
        }
        int var10 = arg0.field6100;
        int var11 = arg0.field6053;
        if ((var8 & 0x1) == 1) {
            var11 = arg0.field6100;
            var10 = arg0.field6053;
        }
        int var12 = var9.method224();
        int var13 = var9.method218();
        if (var6.field109) {
            var12 = var10 * 4;
            var13 = var11 * 4;
        }
        if (arg4 < 55) {
            field2279 = null;
        }
        if (var6.field115 == 0) {
            var9.method3424(arg5, arg2 - ((var11 - 1) * 4), var12, var13);
        } else {
            var9.method3433(arg5, arg2 - ((var11 - 1) * 4), var12, var13, 0, var6.field115 | 0xFF000000, 1);
        }
    }
}
