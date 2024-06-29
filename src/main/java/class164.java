import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class164 extends class101 {

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "Lom;")
    public static class156 field2468 = new class156();

    @OriginalMember(owner = "client!wj", name = "y", descriptor = "Lf;")
    public static class329 field2480 = null;

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "I")
    public int field2469;

    @OriginalMember(owner = "client!wj", name = "o", descriptor = "I")
    public int field2470;

    @OriginalMember(owner = "client!wj", name = "p", descriptor = "I")
    public int field2471;

    @OriginalMember(owner = "client!wj", name = "q", descriptor = "I")
    public int field2472;

    @OriginalMember(owner = "client!wj", name = "r", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!wj", name = "s", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!wj", name = "t", descriptor = "I")
    public int field2475;

    @OriginalMember(owner = "client!wj", name = "u", descriptor = "I")
    public int field2476;

    @OriginalMember(owner = "client!wj", name = "v", descriptor = "I")
    public int field2477;

    @OriginalMember(owner = "client!wj", name = "w", descriptor = "I")
    public int field2478;

    @OriginalMember(owner = "client!wj", name = "x", descriptor = "I")
    public int field2479;

    @OriginalMember(owner = "client!wj", name = "z", descriptor = "I")
    public static int field2481;

    @OriginalMember(owner = "client!wj", name = "B", descriptor = "I")
    public int field2482;

    @OriginalMember(owner = "client!wj", name = "C", descriptor = "I")
    public int field2483;

    @OriginalMember(owner = "client!wj", name = "E", descriptor = "I")
    public int field2485;

    @OriginalMember(owner = "client!wj", name = "F", descriptor = "I")
    public static int field2486;

    @OriginalMember(owner = "client!wj", name = "D", descriptor = "Llm;")
    public static class210 field2484;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "([BZ)[B", line = 4)
    public static final byte[] method1158(byte[] arg0, boolean arg1) {
        field2486++;
        if (arg0 == null) {
            return null;
        }
        if (arg1) {
            method1158((byte[]) null, false);
        }
        byte[] var2 = new byte[arg0.length];
        class85.method589(arg0, 0, var2, 0, arg0.length);
        return var2;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIII)V", line = 44)
    public static final void method1159(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class315.method2160(class40.field488[arg3], arg4, arg0 + arg2, arg0 - arg2, 7);
        int var6 = 0;
        field2473++;
        int var7 = arg5;
        int var8 = arg2 * arg2;
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg5 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var9 << 2;
        int var16 = ((var6 << 1) + 3) * var10;
        int var17 = ((arg5 << 1) - 3) * var11;
        int var18 = var8 << 2;
        if (arg1 <= 123) {
            field2481 = 2;
        }
        int var19 = (arg5 - 1) * var18;
        int var20 = (var6 + 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var20;
                    var13 += var16;
                    var20 += var15;
                    var16 += var15;
                    var6++;
                }
            }
            var7--;
            if (var14 < 0) {
                var13 += var16;
                var16 += var15;
                var14 += var20;
                var20 += var15;
                var6++;
            }
            var13 += -var19;
            var14 += -var17;
            var17 -= var18;
            var19 -= var18;
            int var21 = arg0 + var6;
            int var22 = arg3 + var7;
            int var23 = arg0 - var6;
            int var24 = arg3 - var7;
            class315.method2160(class40.field488[var24], arg4, var21, var23, 7);
            class315.method2160(class40.field488[var22], arg4, var21, var23, 7);
        }
    }

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "(I)V", line = 131)
    public static void method1160(int arg0) {
        if (arg0 == -4190) {
            field2468 = null;
            field2484 = null;
            field2480 = null;
        }
    }
}
