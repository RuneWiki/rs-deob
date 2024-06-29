import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class453 {

    @OriginalMember(owner = "client!wp", name = "b", descriptor = "I")
    public int field5804;

    @OriginalMember(owner = "client!wp", name = "g", descriptor = "I")
    private int field5809;

    @OriginalMember(owner = "client!wp", name = "h", descriptor = "[I")
    public static int[] field5810 = new int[16384];

    @OriginalMember(owner = "client!wp", name = "i", descriptor = "[I")
    public static int[] field5811 = new int[16384];

    @OriginalMember(owner = "client!wp", name = "k", descriptor = "Ltb;")
    public static class450 field5813;

    @OriginalMember(owner = "client!wp", name = "l", descriptor = "Z")
    public static boolean field5814;

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "I")
    public static int field5803;

    @OriginalMember(owner = "client!wp", name = "e", descriptor = "I")
    public static int field5807;

    @OriginalMember(owner = "client!wp", name = "f", descriptor = "I")
    public static int field5808;

    @OriginalMember(owner = "client!wp", name = "j", descriptor = "I")
    public static int field5812;

    @OriginalMember(owner = "client!wp", name = "d", descriptor = "Lih;")
    public static class167 field5806;

    @OriginalMember(owner = "client!wp", name = "c", descriptor = "[[I")
    public static int[][] field5805;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field5810[var2] = (int) (Math.sin((double) var2 * var0) * 16384.0D);
            field5811[var2] = (int) (Math.cos((double) var2 * var0) * 16384.0D);
        }
        field5813 = new class450(8);
        field5814 = false;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(I)I", line = 3)
    public final int method2424(int arg0) {
        field5807++;
        if (arg0 != 25569) {
            this.toString();
        }
        return this.field5809;
    }

    @OriginalMember(owner = "client!wp", name = "toString", descriptor = "()Ljava/lang/String;", line = 14)
    public final String toString() {
        field5808++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIII[BI)Z", line = 24)
    public static final boolean method2425(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        field5803++;
        int var7 = arg0 % arg1;
        int var8;
        if (var7 == 0) {
            var8 = 0;
        } else {
            var8 = arg1 - var7;
        }
        int var9 = -((arg1 + arg6 - 1) / arg1);
        int var10 = -((arg0 + arg1 - 1) / arg1);
        int var11 = 50 % ((arg2 - 78) / 34);
        for (int var12 = var9; var12 < 0; var12++) {
            for (int var13 = var10; var13 < 0; var13++) {
                if (arg5[arg4] == 0) {
                    return true;
                }
                arg4 += arg1;
            }
            int var14 = arg4 - var8;
            if (arg5[var14 - 1] == 0) {
                return true;
            }
            arg4 = arg3 + var14;
        }
        return false;
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(Z)V", line = 73)
    public static void method2426(boolean arg0) {
        field5806 = null;
        if (!arg0) {
            field5810 = null;
            field5811 = null;
            field5805 = null;
            field5813 = null;
        }
    }

    @OriginalMember(owner = "client!wp", name = "a", descriptor = "(IIIII)V", line = 87)
    public static final void method2427(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5812++;
        for (class164 var5 = (class164) class236.field2953.method237(122); var5 != null; var5 = (class164) class236.field2953.method245((byte) 60)) {
            class88.method504(arg3, 0, var5, arg4, arg1, arg2);
        }
        if (arg0 != 1) {
            field5805 = null;
        }
        for (class164 var6 = (class164) class702.field9921.method237(84); var6 != null; var6 = (class164) class702.field9921.method245((byte) 32)) {
            byte var11 = 1;
            class601 var12 = var6.field2167.method3872(32195);
            if (var6.field2167.field9660) {
                var11 = 0;
            } else if (var6.field2167.field9744 == var12.field8426 || var6.field2167.field9744 == var12.field8425 || var6.field2167.field9744 == var12.field8468 || var6.field2167.field9744 == var12.field8457) {
                var11 = 2;
            } else if (var6.field2167.field9744 == var12.field8428 || var6.field2167.field9744 == var12.field8423 || var6.field2167.field9744 == var12.field8439 || var6.field2167.field9744 == var12.field8431) {
                var11 = 3;
            }
            if (var6.field2160 != var11) {
                int var13 = class494.method2667(false, var6.field2167);
                class586 var14 = var6.field2167.field3902;
                if (var14.field8205 != null) {
                    var14 = var14.method3220(-4261, class684.field9606);
                }
                if (var14 == null || var13 == -1) {
                    var6.field2149 = -1;
                    var6.field2157 = false;
                } else if (var6.field2149 != var13 || var6.field2157 != var14.field8189) {
                    if (var6.field2170 != null) {
                        class480.field6387.method1295(var6.field2170);
                        var6.field2170 = null;
                    }
                    var6.field2157 = var14.field8189;
                    var6.field2149 = var13;
                    var6.field2151 = null;
                    var6.field2147 = null;
                }
                var6.field2160 = var11;
            }
            var6.field2162 = var6.field2167.field6461;
            var6.field2159 = var6.field2167.field6461 + (var6.field2167.method2785(-1) << 8);
            var6.field2150 = var6.field2167.field6464;
            var6.field2158 = var6.field2167.field6464 + (var6.field2167.method2785(-1) << 8);
            class88.method504(arg3, 0, var6, arg4, arg1, arg2);
        }
        for (class164 var7 = (class164) class646.field9086.method407((byte) 124); var7 != null; var7 = (class164) class646.field9086.method403(12561)) {
            byte var8 = 1;
            class601 var9 = var7.field2165.method3872(32195);
            if (var7.field2165.field9660) {
                var8 = 0;
            } else if (var7.field2165.field9744 == var9.field8426 || var7.field2165.field9744 == var9.field8425 || var7.field2165.field9744 == var9.field8468 || var7.field2165.field9744 == var9.field8457) {
                var8 = 2;
            } else if (var7.field2165.field9744 == var9.field8428 || var7.field2165.field9744 == var9.field8423 || var7.field2165.field9744 == var9.field8439 || var7.field2165.field9744 == var9.field8431) {
                var8 = 3;
            }
            if (var7.field2160 != var8) {
                int var10 = class259.method1512(var7.field2165, false);
                if (var7.field2149 != var10 || var7.field2157 != var7.field2165.field7001) {
                    if (var7.field2170 != null) {
                        class480.field6387.method1295(var7.field2170);
                        var7.field2170 = null;
                    }
                    var7.field2149 = var10;
                    var7.field2147 = null;
                    var7.field2157 = var7.field2165.field7001;
                    var7.field2151 = null;
                }
                var7.field2160 = var8;
            }
            var7.field2162 = var7.field2165.field6461;
            var7.field2159 = var7.field2165.field6461 + (var7.field2165.method2785(-1) << 8);
            var7.field2150 = var7.field2165.field6464;
            var7.field2158 = var7.field2165.field6464 + (var7.field2165.method2785(arg0 - 2) << 8);
            class88.method504(arg3, arg0 - 1, var7, arg4, arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!wp", name = "<init>", descriptor = "(II)V", line = 227)
    public class453(int arg0, int arg1) {
        this.field5804 = arg1;
        this.field5809 = arg0;
    }
}
