import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class458 {

    @OriginalMember(owner = "client!sp", name = "c", descriptor = "Z")
    public static boolean field6419 = false;

    @OriginalMember(owner = "client!sp", name = "d", descriptor = "[[I")
    public static int[][] field6420 = new int[128][128];

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "I")
    public static int field6417;

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "I")
    public static int field6418;

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(IILnt;)I")
    public static final int method2673(int arg0, int arg1, class151 arg2) {
        field6417++;
        return arg0 <= 79 ? 72 : -1;
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(I)V")
    public static void method2674(int arg0) {
        field6420 = null;
        if (arg0 != 128) {
            field6420 = null;
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(III[BIIII[B)V")
    public static final void method2675(int arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        field6418++;
        int var9 = -(arg2 >> 2);
        int var10 = -7 % ((arg7 + 22) / 49);
        int var11 = -(arg2 & 0x3);
        for (int var12 = -arg1; var12 < 0; var12++) {
            int var10001;
            for (int var13 = var9; var13 < 0; var13++) {
                var10001 = arg5++;
                arg3[var10001] += arg8[arg0++];
                int var15 = arg5++;
                arg3[var15] += arg8[arg0++];
                int var16 = arg5++;
                arg3[var16] += arg8[arg0++];
                int var17 = arg5++;
                arg3[var17] += arg8[arg0++];
            }
            for (int var14 = var11; var14 < 0; var14++) {
                var10001 = arg5++;
                arg3[var10001] += arg8[arg0++];
            }
            arg0 += arg6;
            arg5 += arg4;
        }
    }
}
