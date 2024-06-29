import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class375 {

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "I")
    public int field5319 = -1;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "Lfc;")
    public static class235 field5308 = new class235(39, 6);

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "Lfaa;")
    public static class140 field5315 = null;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "I")
    public int field5309;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public int field5310;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
    public static int field5311;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
    public static int field5312;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "I")
    public int field5314;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
    public int field5316;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "I")
    public int field5317;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "I")
    public static int field5318;

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "I")
    public int field5320;

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "I")
    public int field5321;

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "I")
    public int field5322;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "Lci;")
    public static class413 field5313;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIILvfa;Ljd;Lvu;ILoa;)V", line = 9)
    public static final void method2185(int arg0, int arg1, int arg2, class616 arg3, class209 arg4, class307 arg5, int arg6, class638 arg7) {
        field5318++;
        if (arg0 != -16186) {
            method2187(-56, true);
        }
        int var8 = arg4.field3084 - (arg6 / 2 + 5);
        int var9 = arg2 + 2;
        if (arg5.field4532 != 0) {
            arg7.method3558((byte) 101, var9, arg5.field4532, arg6 + 10, -var9 + 1 + arg2 + arg3.method3407() * arg1, var8);
        }
        if (arg5.field4520 != 0) {
            arg7.method3562(arg5.field4520, 1, (arg2 + (arg1 * arg3.method3407())) + 1 - var9, var8, var9, arg6 + 10);
        }
        int var10 = arg5.field4509;
        if (arg4.field3080 && arg5.field4514 != -1) {
            var10 = arg5.field4514;
        }
        for (int var11 = 0; var11 < arg1; var11++) {
            String var12 = class628.field8767[var11];
            if ((arg1 - 1) > var11) {
                var12 = var12.substring(0, var12.length() - 4);
            }
            arg3.method3408(arg7, var12, arg4.field3084, arg2, var10, true);
            arg2 += arg3.method3407();
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(III[I[J)V", line = 54)
    public static final void method2186(int arg0, int arg1, int arg2, int[] arg3, long[] arg4) {
        if (arg2 != 1) {
            return;
        }
        if (arg1 < arg0) {
            int var5 = (arg0 + arg1) / 2;
            int var6 = arg1;
            long var7 = arg4[var5];
            arg4[var5] = arg4[arg0];
            arg4[arg0] = var7;
            int var9 = arg3[var5];
            arg3[var5] = arg3[arg0];
            arg3[arg0] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg1; var11 < arg0; var11++) {
                if (arg4[var11] < (long) (var11 & var10) + var7) {
                    long var12 = arg4[var11];
                    arg4[var11] = arg4[var6];
                    arg4[var6] = var12;
                    int var14 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6++] = var14;
                }
            }
            arg4[arg0] = arg4[var6];
            arg4[var6] = var7;
            arg3[arg0] = arg3[var6];
            arg3[var6] = var9;
            method2186(var6 - 1, arg1, 1, arg3, arg4);
            method2186(arg0, var6 + 1, 1, arg3, arg4);
        }
        field5312++;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IZ)Z", line = 113)
    public static final boolean method2187(int arg0, boolean arg1) {
        if (arg1) {
            method2187(-114, false);
        }
        field5311++;
        if (arg0 == 4 || arg0 == 17 || arg0 == 57 || arg0 == 8 || arg0 == 9) {
            return true;
        } else {
            return arg0 == 3 || arg0 == 1009;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)V", line = 145)
    public static void method2188(int arg0) {
        field5308 = null;
        if (arg0 > 95) {
            field5313 = null;
            field5315 = null;
        }
    }
}
