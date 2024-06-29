import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public abstract class class653 {

    @OriginalMember(owner = "client!sa", name = "d", descriptor = "[[I")
    public static int[][] field9253 = new int[][] { { 2, 4 }, { 2, 4 }, { 5, 2, 4 }, { 4, 5, 2 }, { 2, 4, 5 }, { 5, 2, 4 }, { 1, 6, 2, 5 }, { 1, 6, 7, 1 }, { 6, 7, 1, 1 }, { 0, 8, 9, 8, 9, 4 }, { 8, 9, 4, 0, 8, 9 }, { 2, 10, 0, 10, 11, 11 }, { 2, 4 }, { 1, 6, 7, 1 }, { 1, 6, 7, 1 } };

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "I")
    public static int field9250 = -1;

    @OriginalMember(owner = "client!sa", name = "b", descriptor = "I")
    public static int field9251;

    @OriginalMember(owner = "client!sa", name = "c", descriptor = "I")
    public static int field9252;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lqe;I)I", line = 9)
    public static final int method3618(class122 arg0, int arg1) {
        field9252++;
        if (arg1 != 7) {
            method3619((byte) 69);
        }
        int var2 = arg0.method752(0, 2);
        int var3;
        if (var2 == 0) {
            var3 = 0;
        } else if (var2 == 1) {
            var3 = arg0.method752(0, 5);
        } else if (var2 == 2) {
            var3 = arg0.method752(0, 8);
        } else {
            var3 = arg0.method752(0, 11);
        }
        return var3;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V", line = 39)
    public static void method3619(byte arg0) {
        if (arg0 != 56) {
            field9253 = null;
        }
        field9253 = null;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIZI[I)V", line = 58)
    public static final void method3620(int arg0, int arg1, boolean arg2, int arg3, int[] arg4) {
        arg1--;
        field9251++;
        if (arg2) {
            field9250 = -62;
        }
        int var6 = arg0 - 1;
        int var5 = var6 - 7;
        while (arg1 < var5) {
            int var7 = arg1 + 1;
            arg4[var7] = arg3;
            int var8 = var7 + 1;
            arg4[var8] = arg3;
            int var9 = var8 + 1;
            arg4[var9] = arg3;
            int var10 = var9 + 1;
            arg4[var10] = arg3;
            int var11 = var10 + 1;
            arg4[var11] = arg3;
            int var12 = var11 + 1;
            arg4[var12] = arg3;
            int var13 = var12 + 1;
            arg4[var13] = arg3;
            arg1 = var13 + 1;
            arg4[arg1] = arg3;
        }
        while (var6 > arg1) {
            arg1++;
            arg4[arg1] = arg3;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "([BI)V")
    public abstract void method2522(byte[] arg0, int arg1);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(III)[B")
    public abstract byte[] method2523(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)[B")
    public abstract byte[] method2521(int arg0);
}
