import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gh")
public class class514 {

    @OriginalMember(owner = "client!gh", name = "b", descriptor = "Lpd;")
    public static class241 field6536 = new class241();

    @OriginalMember(owner = "client!gh", name = "c", descriptor = "I")
    public static int field6537;

    @OriginalMember(owner = "client!gh", name = "d", descriptor = "I")
    public static int field6538;

    @OriginalMember(owner = "client!gh", name = "e", descriptor = "I")
    public static int field6539;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "[I")
    public static int[] field6535;

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(IIIB)I", line = 8)
    public static final int method2798(int arg0, int arg1, int arg2, byte arg3) {
        field6538++;
        if (arg3 <= 10) {
            field6535 = null;
        }
        if (class299.field3801 == null) {
            return 0;
        }
        int var4 = arg1 >> 9;
        int var5 = arg0 >> 9;
        if (var4 < 0 || var5 < 0 || var4 > (class85.field1090 - 1) || var5 > class656.field8932 - 1) {
            return 0;
        }
        int var6 = arg2;
        if (arg2 < 3 && (class234.field3033[1][var4][var5] & 0x2) != 0) {
            var6 = arg2 + 1;
        }
        return class299.field3801[var6].method194(arg1, arg0);
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(III)Z", line = 41)
    public static final boolean method2799(int arg0, int arg1, int arg2) {
        field6537++;
        if (arg0 != 24419) {
            method2799(62, -39, 10);
        }
        return false;
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "(B)V", line = 52)
    public static void method2800(byte arg0) {
        field6536 = null;
        field6535 = null;
        if (arg0 != -64) {
            field6536 = null;
        }
    }

    @OriginalMember(owner = "client!gh", name = "a", descriptor = "([SII[Ljava/lang/String;I)V", line = 64)
    public static final void method2801(short[] arg0, int arg1, int arg2, String[] arg3, int arg4) {
        if (arg4 > arg2) {
            int var5 = (arg2 + arg4) / 2;
            int var6 = arg2;
            String var7 = arg3[var5];
            arg3[var5] = arg3[arg4];
            arg3[arg4] = var7;
            short var8 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var8;
            for (int var9 = arg2; var9 < arg4; var9++) {
                if (var7 == null || arg3[var9] != null && (var9 & 0x1) > arg3[var9].compareTo(var7)) {
                    String var10 = arg3[var9];
                    arg3[var9] = arg3[var6];
                    arg3[var6] = var10;
                    short var11 = arg0[var9];
                    arg0[var9] = arg0[var6];
                    arg0[var6++] = var11;
                }
            }
            arg3[arg4] = arg3[var6];
            arg3[var6] = var7;
            arg0[arg4] = arg0[var6];
            arg0[var6] = var8;
            method2801(arg0, 1, arg2, arg3, var6 - 1);
            method2801(arg0, 1, var6 + 1, arg3, arg4);
        }
        field6539++;
        if (arg1 != 1) {
            method2799(-83, 18, -5);
        }
    }
}
