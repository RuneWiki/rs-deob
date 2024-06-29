import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class140 {

    @OriginalMember(owner = "client!nb", name = "c", descriptor = "Loc;")
    public static class151 field2549 = class137.method873(2, "::fpson");

    @OriginalMember(owner = "client!nb", name = "f", descriptor = "[I")
    public static int[] field2552 = new int[5];

    @OriginalMember(owner = "client!nb", name = "d", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "Lnd;")
    public static class142 field2548;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "Lcg;")
    public static class30 field2547;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "[I")
    public static int[] field2551;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II[Ln;III[B)V")
    public static final void method902(int arg0, int arg1, class138[] arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        field2550++;
        for (int var7 = arg5; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg1 + var12 > 0 && arg1 + var12 < 103 && arg0 + var13 > 0 && arg0 + var13 < 103) {
                        arg2[var7].field2512[arg1 + var12][arg0 + var13] = class26.method206(arg2[var7].field2512[arg1 + var12][arg0 + var13], -16777217);
                    }
                }
            }
        }
        class229 var8 = new class229(arg6);
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class1.method1(var8, arg1 + var10, -117, arg4, 0, var9, arg3, arg0 + var11);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(I)V")
    public static void method903(int arg0) {
        field2549 = null;
        field2547 = null;
        field2552 = null;
        if (arg0 <= 28) {
            field2549 = null;
        }
        field2548 = null;
        field2551 = null;
    }
}
