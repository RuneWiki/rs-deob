import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jo")
public class class335 extends class372 {

    @OriginalMember(owner = "client!jo", name = "Z", descriptor = "J")
    public static volatile long field4984 = 0L;

    @OriginalMember(owner = "client!jo", name = "V", descriptor = "Lwl;")
    public static class452 field4982 = new class452(43, 15);

    @OriginalMember(owner = "client!jo", name = "ab", descriptor = "Lpf;")
    public static class425 field4985 = new class425(69, 3);

    @OriginalMember(owner = "client!jo", name = "cb", descriptor = "[B")
    public static byte[] field4987 = new byte[2048];

    @OriginalMember(owner = "client!jo", name = "Y", descriptor = "I")
    public static int field4983;

    @OriginalMember(owner = "client!jo", name = "bb", descriptor = "I")
    public static int field4986;

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ILgo;Lfh;IIIIILlp;Lor;Ljava/lang/String;I)V")
    public static final void method2047(int arg0, class272 arg1, class170 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class137 arg8, class153 arg9, String arg10, int arg11) {
        ++field4983;
        int var12;
        if (~class80.field1054 == -5) {
            var12 = 16383 & (int) class462.field6810;
        } else {
            var12 = (int) class462.field6810 - -class3.field39 & 16383;
        }
        int var13 = Math.max(arg2.field2561 / 2, arg2.field2501 / 2) + 10;
        int var14 = arg7 * arg7 - -(arg4 * arg4);
        if (~(var13 * var13) <= ~var14) {
            int var15 = class110.field1450[var12];
            int var16 = class110.field1452[var12];
            if (class80.field1054 != 4) {
                var16 = var16 * 256 / (class343.field5138 + 256);
                var15 = var15 * 256 / (class343.field5138 + 256);
            }
            int var17 = arg4 * var15 - -(arg7 * var16) >> 15;
            if (arg3 != 9349) {
                field4982 = null;
            }
            int var18 = arg4 * var16 + -(arg7 * var15) >> 15;
            int var19 = arg1.method1700(arg10, -42, (class234[]) null, 100);
            int var20 = arg1.method1697((class234[]) null, arg10, 0, (byte) -63, 100);
            int var21 = var17 - var19 / 2;
            if (~(-arg2.field2561) >= ~var21 && ~var21 >= ~arg2.field2561 && ~var18 <= ~(-arg2.field2501) && var18 <= arg2.field2501) {
                arg8.method871(50, 0, arg11, arg5, arg6, (int[]) null, arg2.field2561 / 2 + arg5 + var21, (class234[]) null, -1636, arg2.field2501 / 2 + -var18 + -var20 + -arg0 + arg6, var19, arg9, arg10, 0, 0, 1);
            }
        }
    }

    @OriginalMember(owner = "client!jo", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method195(boolean arg0, int arg1) {
        if (arg0) {
            this.method195(false, -94);
        }
        ++field4986;
        int[][] var3 = super.field1549.method2013(arg1, !arg0);
        if (super.field1549.field4903 && this.method2237(94)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field5425 * super.field5425;
            for (int var8 = 0; var8 < class440.field6474; ++var8) {
                int var9 = super.field5424[var8 % super.field5429 + var7];
                var6[var8] = class406.method2552(4080, var9 << 4);
                var5[var8] = class406.method2552(var9, 65280) >> 4;
                var4[var8] = class406.method2552(4080, var9 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jo", name = "i", descriptor = "(I)V")
    public static void method2048(int arg0) {
        field4987 = null;
        if (arg0 == 220) {
            field4985 = null;
            field4982 = null;
        }
    }
}
