import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gi")
public class class571 extends class591 {

    @OriginalMember(owner = "client!gi", name = "k", descriptor = "Lfj;")
    public class75 field8300;

    @OriginalMember(owner = "client!gi", name = "j", descriptor = "[I")
    public static int[] field8299 = new int[200];

    @OriginalMember(owner = "client!gi", name = "g", descriptor = "I")
    public static int field8296;

    @OriginalMember(owner = "client!gi", name = "h", descriptor = "I")
    public static int field8297;

    @OriginalMember(owner = "client!gi", name = "i", descriptor = "I")
    public static int field8298;

    @OriginalMember(owner = "client!gi", name = "l", descriptor = "Lmv;")
    public static class295 field8301;

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(I)V", line = 5)
    public static void method3279(int arg0) {
        if (arg0 >= -100) {
            method3279(-78);
        }
        field8301 = null;
        field8299 = null;
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(BLtba;)V", line = 18)
    public static final void method3280(byte arg0, class48 arg1) {
        field8296++;
        class248.field3274 = arg1;
        if (arg0 <= 93) {
            field8299 = null;
        }
    }

    @OriginalMember(owner = "client!gi", name = "a", descriptor = "(IILr;IILhi;Lks;Lhh;)V", line = 29)
    public static final void method3281(int arg0, int arg1, class98 arg2, int arg3, int arg4, class415 arg5, class421 arg6, class168 arg7) {
        field8297++;
        int var8 = arg5.field6139 - (arg4 / 2) - 5;
        int var9 = arg3 + 2;
        if (arg7.field2346 != 0) {
            arg2.method710(var9, 22339, arg7.field2346, arg4 + 10, var8, arg0 * arg6.method2549() + arg3 + 1 - var9);
        }
        if (arg1 != -19480) {
            return;
        }
        if (arg7.field2341 != 0) {
            arg2.method714(arg7.field2341, arg1 + 32324, arg3 + 1 + (arg6.method2549() * arg0 - var9), arg4 + 10, var9, var8);
        }
        int var10 = arg7.field2360;
        if (arg5.field6140 && arg7.field2363 != -1) {
            var10 = arg7.field2363;
        }
        for (int var11 = 0; var11 < arg0; var11++) {
            String var12 = class194.field2605[var11];
            if ((arg0 - 1) > var11) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg6.method2550(arg2, var12, arg5.field6139, arg3, var10, true);
            arg3 += arg6.method2549();
        }
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lum;II[B)V", line = 77)
    public class571(class528 arg0, int arg1, int arg2, byte[] arg3) {
        this.field8300 = arg0.method3009(arg3, (byte) 62, arg1, false, class592.field8601, arg2);
        this.field8300.method432(false, false, (byte) 94);
    }

    @OriginalMember(owner = "client!gi", name = "<init>", descriptor = "(Lum;II[I)V", line = 89)
    public class571(class528 arg0, int arg1, int arg2, int[] arg3) {
        this.field8300 = arg0.method3035(arg2, arg1, (byte) -50, false, arg3);
        this.field8300.method432(false, false, (byte) 92);
    }
}
