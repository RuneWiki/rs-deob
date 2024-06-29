import jaclib.memory.heap.NativeHeap;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class778 extends class731 {

    @OriginalMember(owner = "client!au", name = "z", descriptor = "Ljaclib/memory/heap/NativeHeap;")
    public NativeHeap field10682;

    @OriginalMember(owner = "client!au", name = "q", descriptor = "[F")
    public static float[] field10673 = new float[2];

    @OriginalMember(owner = "client!au", name = "p", descriptor = "[Lis;")
    public static class119[] field10672 = new class119[16];

    @OriginalMember(owner = "client!au", name = "s", descriptor = "I")
    public static int field10675 = 0;

    @OriginalMember(owner = "client!au", name = "r", descriptor = "I")
    public static int field10674;

    @OriginalMember(owner = "client!au", name = "t", descriptor = "I")
    public static int field10676;

    @OriginalMember(owner = "client!au", name = "u", descriptor = "I")
    public static int field10677;

    @OriginalMember(owner = "client!au", name = "w", descriptor = "I")
    public static int field10679;

    @OriginalMember(owner = "client!au", name = "y", descriptor = "I")
    public static int field10681;

    @OriginalMember(owner = "client!au", name = "x", descriptor = "J")
    public static long field10680;

    @OriginalMember(owner = "client!au", name = "v", descriptor = "Lcea;")
    public static class111 field10678;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(I)V", line = 4)
    public static void method4277(int arg0) {
        field10672 = null;
        field10678 = null;
        if (arg0 == 976) {
            field10673 = null;
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIII[BI[BII)V", line = 28)
    public static final void method4278(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        field10676++;
        if (arg5 != 23068) {
            field10672 = null;
        }
        int var9 = -(arg7 >> 2);
        int var10 = -(arg7 & 0x3);
        for (int var11 = -arg8; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg1++;
                arg4[var10001] += arg6[arg3++];
                int var14 = arg1++;
                arg4[var14] += arg6[arg3++];
                int var15 = arg1++;
                arg4[var15] += arg6[arg3++];
                int var16 = arg1++;
                arg4[var16] += arg6[arg3++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg1++;
                arg4[var10001] += arg6[arg3++];
            }
            arg1 += arg0;
            arg3 += arg2;
        }
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(I)V", line = 79)
    public final void method4279(int arg0) {
        this.field10682.method2248();
        if (arg0 == 1886443298) {
            field10677++;
        }
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "(I)V", line = 94)
    public class778(int arg0) {
        this.field10682 = new NativeHeap(arg0);
    }
}
