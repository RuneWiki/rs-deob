import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class630 extends class385 {

    @OriginalMember(owner = "client!laa", name = "r", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field8866;

    @OriginalMember(owner = "client!laa", name = "s", descriptor = "Lsb;")
    public static class305 field8867 = new class305(29, 6);

    @OriginalMember(owner = "client!laa", name = "p", descriptor = "I")
    public static int field8864;

    @OriginalMember(owner = "client!laa", name = "q", descriptor = "I")
    public static int field8865;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(I)V", line = 3)
    public static void method3535(int arg0) {
        field8867 = null;
        if (arg0 != -1) {
            method3536(67, 89, 81, -62, false, null, 17, null, 39);
        }
    }

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(IIIIZ[BI[BI)V", line = 14)
    public static final void method3536(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, byte[] arg7, int arg8) {
        field8864++;
        if (arg4) {
            field8867 = null;
        }
        int var9 = -(arg8 >> 2);
        int var10 = -(arg8 & 0x3);
        for (int var11 = -arg3; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg2++;
                arg7[var10001] = (byte) (arg7[var10001] - arg5[arg0++]);
                int var14 = arg2++;
                arg7[var14] = (byte) (arg7[var14] - arg5[arg0++]);
                int var15 = arg2++;
                arg7[var15] = (byte) (arg7[var15] - arg5[arg0++]);
                int var16 = arg2++;
                arg7[var16] = (byte) (arg7[var16] - arg5[arg0++]);
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg2++;
                arg7[var10001] = (byte) (arg7[var10001] - arg5[arg0++]);
            }
            arg0 += arg1;
            arg2 += arg6;
        }
    }

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "(I)V", line = 61)
    public final void method3537(int arg0) {
        int var2 = 9 / ((arg0 + 83) / 33);
        this.field8866.method3461();
        field8865++;
    }

    @OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(I)V", line = 73)
    public class630(int arg0) {
        this.field8866 = new NativeHeap(arg0);
    }
}
