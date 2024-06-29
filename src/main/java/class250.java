import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class250 extends class328 {

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    private int field3450;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "I")
    private int field3457;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "I")
    private int field3454;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "I")
    private int field3456;

    @OriginalMember(owner = "client!he", name = "z", descriptor = "I")
    private int field3461;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    private int field3448;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "I")
    private int field3459;

    @OriginalMember(owner = "client!he", name = "n", descriptor = "I")
    private int field3449;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "[[I")
    public static int[][] field3452 = new int[128][128];

    @OriginalMember(owner = "client!he", name = "p", descriptor = "Lmn;")
    public static class247 field3451 = new class247(8);

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "I")
    public static int field3458;

    @OriginalMember(owner = "client!he", name = "y", descriptor = "I")
    public static int field3460;

    @OriginalMember(owner = "client!he", name = "A", descriptor = "I")
    public static int field3462;

    @OriginalMember(owner = "client!he", name = "B", descriptor = "[I")
    public static int[] field3463;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IZI)V", line = 9)
    public final void method5(int arg0, boolean arg1, int arg2) {
        ++field3458;
        if (arg1) {
            method1499(46);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "([I[[B[IIII[[B[B)I", line = 25)
    public static final int method1498(int[] arg0, byte[][] arg1, int[] arg2, int arg3, int arg4, int arg5, byte[][] arg6, byte[] arg7) {
        ++field3460;
        int var8 = arg0[arg5];
        int var9 = arg2[arg5] + var8;
        int var10 = arg0[arg4];
        int var11 = arg2[arg4] + var10;
        int var12 = var8;
        if (~var8 > ~var10) {
            var12 = var10;
        }
        int var13 = var9;
        if (~var11 > ~var9) {
            var13 = var11;
        }
        int var14 = arg3 & arg7[arg5];
        if (~var14 < ~(255 & arg7[arg4])) {
            var14 = arg7[arg4] & 255;
        }
        byte[] var15 = arg6[arg5];
        byte[] var16 = arg1[arg4];
        int var17 = -var8 + var12;
        int var18 = -var10 + var12;
        for (int var19 = var12; var13 > var19; ++var19) {
            int var20 = var16[var18++] + var15[var17++];
            if (~var14 < ~var20) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(I)V", line = 78)
    public static void method1499(int arg0) {
        field3463 = null;
        if (arg0 == 1141967820) {
            field3452 = null;
            field3451 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(IIIIIIIIII)V", line = 94)
    public class250(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        super(-1, arg8, arg9);
        this.field3450 = arg5;
        this.field3457 = arg0;
        this.field3454 = arg6;
        this.field3456 = arg7;
        this.field3461 = arg4;
        this.field3448 = arg2;
        this.field3459 = arg1;
        this.field3449 = arg3;
    }

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(III)V", line = 112)
    public final void method3(int arg0, int arg1, int arg2) {
        ++field3455;
        int var4 = this.field3457 * arg0 >> 12;
        if (arg2 != -1342) {
            method1498((int[]) null, (byte[][]) null, (int[]) null, 113, -33, 90, (byte[][]) null, (byte[]) null);
        }
        int var5 = this.field3459 * arg1 >> 12;
        int var6 = this.field3448 * arg0 >> 12;
        int var7 = this.field3449 * arg1 >> 12;
        int var8 = this.field3461 * arg0 >> 12;
        int var9 = this.field3450 * arg1 >> 12;
        int var10 = this.field3454 * arg0 >> 12;
        int var11 = this.field3456 * arg1 >> 12;
        class167.method1105(var4, var11, var7, var10, super.field4487, var6, var8, arg2 ^ -1341, var9, var5);
    }

    @OriginalMember(owner = "client!he", name = "b", descriptor = "(III)V", line = 140)
    public final void method4(int arg0, int arg1, int arg2) {
        ++field3453;
        if (arg1 != 0) {
            method1498((int[]) null, (byte[][]) null, (int[]) null, 53, 20, 98, (byte[][]) null, (byte[]) null);
        }
    }
}
