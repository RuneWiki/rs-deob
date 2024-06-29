import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class372 extends class413 {

    @OriginalMember(owner = "client!gr", name = "q", descriptor = "[I")
    public static int[] field5041 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!gr", name = "r", descriptor = "I")
    public static int field5042 = 0;

    @OriginalMember(owner = "client!gr", name = "u", descriptor = "S")
    public static short field5045 = 32767;

    @OriginalMember(owner = "client!gr", name = "v", descriptor = "[I")
    public static int[] field5046 = new int[14];

    @OriginalMember(owner = "client!gr", name = "w", descriptor = "I")
    public static int field5047 = 0;

    @OriginalMember(owner = "client!gr", name = "s", descriptor = "Lhq;")
    public static class365 field5043 = new class365(8);

    @OriginalMember(owner = "client!gr", name = "t", descriptor = "I")
    public static int field5044;

    @OriginalMember(owner = "client!gr", name = "x", descriptor = "I")
    public static int field5048;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "(I)V")
    public static void method2333(int arg0) {
        if (arg0 != 15311) {
            method2334(36, 40, -113, (short[]) null, (String[]) null);
        }
        field5046 = null;
        field5043 = null;
        field5041 = null;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(III[S[Ljava/lang/String;)V")
    public static final void method2334(int arg0, int arg1, int arg2, short[] arg3, String[] arg4) {
        if (arg2 < arg1) {
            int var5 = (arg2 + arg1) / 2;
            int var6 = arg2;
            String var7 = arg4[var5];
            arg4[var5] = arg4[arg1];
            arg4[arg1] = var7;
            short var8 = arg3[var5];
            arg3[var5] = arg3[arg1];
            arg3[arg1] = var8;
            for (int var9 = arg2; var9 < arg1; var9++) {
                if (var7 == null || arg4[var9] != null && arg4[var9].compareTo(var7) < (var9 & 0x1)) {
                    String var10 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6] = var10;
                    short var11 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6++] = var11;
                }
            }
            arg4[arg1] = arg4[var6];
            arg4[var6] = var7;
            arg3[arg1] = arg3[var6];
            arg3[var6] = var8;
            method2334(97, var6 - 1, arg2, arg3, arg4);
            method2334(122, arg1, var6 + 1, arg3, arg4);
        }
        field5044++;
        int var12 = 51 % ((48 - arg0) / 43);
    }
}
