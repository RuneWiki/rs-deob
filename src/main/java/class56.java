import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class56 {

    @OriginalMember(owner = "client!ua", name = "c", descriptor = "I")
    public static int field770 = 0;

    @OriginalMember(owner = "client!ua", name = "g", descriptor = "Lqe;")
    private static class168 field774 = class66.method448("yellow:", -112);

    @OriginalMember(owner = "client!ua", name = "i", descriptor = "I")
    public static int field776 = 0;

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "I")
    public static int field773 = 0;

    @OriginalMember(owner = "client!ua", name = "h", descriptor = "Lqe;")
    public static class168 field775 = class66.method448("www", 64);

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "Lqe;")
    public static class168 field772 = field774;

    @OriginalMember(owner = "client!ua", name = "k", descriptor = "Lqe;")
    public static class168 field778 = field774;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "[J")
    public static long[] field768 = new long[200];

    @OriginalMember(owner = "client!ua", name = "l", descriptor = "I")
    public static int field779 = 0;

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "I")
    public static int field769;

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "I")
    public static int field771;

    @OriginalMember(owner = "client!ua", name = "j", descriptor = "I")
    public static int field777;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IB)I")
    public static final int method389(int arg0, byte arg1) {
        field777++;
        int var2 = arg0 & 0x3F;
        if (arg1 <= 84) {
            method391(-89, 30, 12, -54, null, (byte) -72, null, 47, 41, 61, 92);
        }
        int var3 = arg0 >> 6 & 0x3;
        if (var2 == 18) {
            if (var3 == 0) {
                return 1;
            }
            if (var3 == 1) {
                return 2;
            }
            if (var3 == 2) {
                return 4;
            }
            if (var3 == 3) {
                return 8;
            }
        } else if (var2 == 19 || var2 == 21) {
            if (var3 == 0) {
                return 16;
            }
            if (var3 == 1) {
                return 32;
            }
            if (var3 == 2) {
                return 64;
            }
            if (var3 == 3) {
                return 128;
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I)V")
    public static void method390(int arg0) {
        field775 = null;
        field778 = null;
        field772 = null;
        field768 = null;
        if (arg0 != -2) {
            field775 = null;
        }
        field774 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIII[BB[IIIII)V")
    public static final void method391(int arg0, int arg1, int arg2, int arg3, byte[] arg4, byte arg5, int[] arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = ((arg7 & 0xFF00) * arg9 & 0xFF0000) + ((arg7 & 0xFF00FF) * arg9 & 0xFF00FF00) >> 8;
        int var12 = 256 - arg9;
        if (arg5 != -20) {
            method389(-100, (byte) 65);
        }
        for (int var13 = -arg8; var13 < 0; var13++) {
            for (int var14 = -arg0; var14 < 0; var14++) {
                if (arg4[arg3++] == 0) {
                    arg2++;
                } else {
                    int var15 = arg6[arg2];
                    arg6[arg2++] = var11 + (class86.method571(var12 * class86.method571(16711935, var15), -16711936) + class86.method571(class86.method571(65280, var15) * var12, 16711680) >> 8);
                }
            }
            arg3 += arg10;
            arg2 += arg1;
        }
        field769++;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIZII)V")
    public static final void method392(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var6 = -25 / ((arg2 + 90) / 34);
        client.field538 = (short) arg4;
        class25.field296 = (short) arg5;
        field771++;
    }
}
