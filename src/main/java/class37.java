import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class37 extends class17 {

    @OriginalMember(owner = "client!fa", name = "A", descriptor = "[I")
    public int[] field822 = new int[1];

    @OriginalMember(owner = "client!fa", name = "E", descriptor = "[I")
    public int[] field826 = new int[] { -1 };

    @OriginalMember(owner = "client!fa", name = "x", descriptor = "J")
    public static long field819 = 0L;

    @OriginalMember(owner = "client!fa", name = "y", descriptor = "Lmb;")
    private static class84 field820 = class79.method672(true, "Offline");

    @OriginalMember(owner = "client!fa", name = "D", descriptor = "Lmb;")
    private static class84 field825 = class79.method672(true, "Loaded wordpack");

    @OriginalMember(owner = "client!fa", name = "J", descriptor = "I")
    public static int field831 = 0;

    @OriginalMember(owner = "client!fa", name = "C", descriptor = "Lmb;")
    public static class84 field824 = field825;

    @OriginalMember(owner = "client!fa", name = "G", descriptor = "Lmb;")
    public static class84 field828 = field820;

    @OriginalMember(owner = "client!fa", name = "F", descriptor = "[I")
    public static int[] field827 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!fa", name = "H", descriptor = "I")
    public static int field829 = 0;

    @OriginalMember(owner = "client!fa", name = "K", descriptor = "I")
    public static int field832 = 0;

    @OriginalMember(owner = "client!fa", name = "z", descriptor = "I")
    public static int field821;

    @OriginalMember(owner = "client!fa", name = "I", descriptor = "I")
    public static int field830;

    @OriginalMember(owner = "client!fa", name = "B", descriptor = "[I")
    public static int[] field823;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "([Ljc;I[BIIII)V")
    public static final void method278(class65[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6) {
        field821++;
        for (int var7 = arg3; var7 < 4; var7++) {
            for (int var12 = 0; var12 < 64; var12++) {
                for (int var13 = 0; var13 < 64; var13++) {
                    if (arg4 + var12 > 0 && arg4 + var12 < 103 && arg5 + var13 > 0 && arg5 + var13 < 103) {
                        arg0[var7].field1591[arg4 + var12][arg5 + var13] = client.method144(arg0[var7].field1591[arg4 + var12][arg5 + var13], -16777217);
                    }
                }
            }
        }
        class51 var8 = new class51(arg2);
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < 64; var10++) {
                for (int var11 = 0; var11 < 64; var11++) {
                    class122.method998(var9, 18050, arg5 + var11, arg6, 0, var8, arg4 + var10, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "d", descriptor = "(I)V")
    public static final void method279(int arg0) {
        class14.field273.method966(false);
        if (arg0 != 13997) {
            method280((byte) -40);
        }
        field830++;
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(B)V")
    public static void method280(byte arg0) {
        field820 = null;
        field824 = null;
        int var1 = 23 / ((-arg0 - 27) / 59);
        field827 = null;
        field823 = null;
        field828 = null;
        field825 = null;
    }
}
