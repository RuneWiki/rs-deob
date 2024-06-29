import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vfa")
public class class437 implements class682 {

    @OriginalMember(owner = "client!vfa", name = "i", descriptor = "Ldp;")
    private class446 field5658;

    @OriginalMember(owner = "client!vfa", name = "d", descriptor = "Lpe;")
    private class615 field5653;

    @OriginalMember(owner = "client!vfa", name = "e", descriptor = "Lra;")
    public static class361 field5654 = new class361(45, -1);

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "I")
    public static int field5650;

    @OriginalMember(owner = "client!vfa", name = "c", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!vfa", name = "f", descriptor = "I")
    public static int field5655;

    @OriginalMember(owner = "client!vfa", name = "g", descriptor = "I")
    public static int field5656;

    @OriginalMember(owner = "client!vfa", name = "h", descriptor = "I")
    public static int field5657;

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "Lxa;")
    private class511 field5651;

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I[II[JI)V")
    public static final void method2485(int arg0, int[] arg1, int arg2, long[] arg3, int arg4) {
        field5656++;
        if (arg4 > arg0) {
            int var5 = (arg0 + arg4) / 2;
            int var6 = arg0;
            long var7 = arg3[var5];
            arg3[var5] = arg3[arg4];
            arg3[arg4] = var7;
            int var9 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var9;
            int var10 = ~var7 == Long.MIN_VALUE ? 0 : 1;
            for (int var11 = arg0; var11 < arg4; var11++) {
                if (arg3[var11] < ((long) (var11 & var10) + var7)) {
                    long var12 = arg3[var11];
                    arg3[var11] = arg3[var6];
                    arg3[var6] = var12;
                    int var14 = arg1[var11];
                    arg1[var11] = arg1[var6];
                    arg1[var6++] = var14;
                }
            }
            arg3[arg4] = arg3[var6];
            arg3[var6] = var7;
            arg1[arg4] = arg1[var6];
            arg1[var6] = var9;
            method2485(arg0, arg1, -64, arg3, var6 - 1);
            method2485(var6 + 1, arg1, -54, arg3, arg4);
        }
        int var15 = 106 % ((arg2 - 20) / 48);
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(I)V")
    public final void method449(int arg0) {
        field5650++;
        this.field5651 = class53.method462(26513, this.field5658.field5732, this.field5653);
        int var2 = 113 / ((65 - arg0) / 45);
    }

    @OriginalMember(owner = "client!vfa", name = "b", descriptor = "(B)V")
    public static void method2486(byte arg0) {
        if (arg0 == -48) {
            field5654 = null;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(IZ)V")
    public final void method448(int arg0, boolean arg1) {
        field5657++;
        if (arg1) {
            int var3 = class94.field1240 >= class519.field6796 ? class94.field1240 : class519.field6796;
            int var4 = class461.field6047 <= class535.field6968 ? class535.field6968 : class461.field6047;
            int var5 = this.field5651.method602();
            int var6 = this.field5651.method595();
            int var7 = 0;
            int var8 = var3;
            int var9 = var3 * var6 / var5;
            int var10 = (var4 - var9) / 2;
            if (var9 > var4) {
                var10 = 0;
                var8 = var4 * var5 / var6;
                var9 = var4;
                var7 = (var3 - var8) / 2;
            }
            this.field5651.method2754(var7, var10, var8, var9);
        }
        if (arg0 != -207) {
            this.field5651 = null;
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(B)Z")
    public final boolean method444(byte arg0) {
        if (arg0 >= -10) {
            return false;
        } else {
            field5652++;
            return this.field5653.method3362(this.field5658.field5732, -124);
        }
    }

    @OriginalMember(owner = "client!vfa", name = "a", descriptor = "(Lfd;I)Lku;")
    public static final class192 method2487(class418 arg0, int arg1) {
        field5655++;
        arg0.method2396(-125);
        int var2 = arg0.method2396(22);
        class192 var3 = class390.method2229(var2, -34);
        var3.field2454 = arg0.method2396(-124);
        int var4 = arg0.method2396(-126);
        for (int var5 = arg1; var5 < var4; var5++) {
            int var6 = arg0.method2396(-17);
            var3.method109(var6, arg0, -12160);
        }
        var3.method618((byte) 63);
        return var3;
    }

    @OriginalMember(owner = "client!vfa", name = "<init>", descriptor = "(Lpe;Ldp;)V")
    public class437(class615 arg0, class446 arg1) {
        this.field5658 = arg1;
        this.field5653 = arg0;
    }
}
