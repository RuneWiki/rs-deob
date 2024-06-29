import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class600 implements class58 {

    @OriginalMember(owner = "client!de", name = "b", descriptor = "I")
    public static int field8521 = -1;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "S")
    public static short field8520 = 32767;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "[Z")
    public static boolean[] field8525 = new boolean[8];

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field8522;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "I")
    public static int field8523;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "Lbaa;")
    public static class128 field8526;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "[[Lqk;")
    public static class146[][] field8524;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II[IIIIIB)Z", line = 3)
    public static final boolean method3503(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, byte arg7) {
        field8523++;
        if (arg3 < 0) {
            arg3 = 0;
        }
        if (arg4 > class165.field2353) {
            arg4 = class165.field2353;
        }
        if (arg4 <= arg3) {
            return true;
        }
        if (arg7 != -90) {
            method3504(-128);
        }
        int var8 = arg1 * arg3 + arg0;
        int var9 = arg4 - arg3 >> 2;
        int var10 = arg3 + arg6 - 1;
        int var10000;
        if (class513.field7427 == 1) {
            class163.field2324 += var9;
            while (true) {
                var9--;
                if (var9 < 0) {
                    int var16 = arg4 - arg3 & 0x3;
                    while (true) {
                        var16--;
                        if (var16 < 0) {
                            return true;
                        }
                        var10++;
                        if (arg2[var10] > var8) {
                            arg2[var10] = var8;
                        }
                        var8 += arg1;
                    }
                }
                var10++;
                if (arg2[var10] > var8) {
                    arg2[var10] = var8;
                }
                int var17 = arg1 + var8;
                var10000 = ~var17;
                var10++;
                if (var10000 > ~arg2[var10]) {
                    arg2[var10] = var17;
                }
                int var18 = arg1 + var17;
                var10000 = ~var18;
                var10++;
                if (var10000 > ~arg2[var10]) {
                    arg2[var10] = var18;
                }
                int var19 = arg1 + var18;
                var10++;
                if (var19 < arg2[var10]) {
                    arg2[var10] = var19;
                }
                var8 = arg1 + var19;
            }
        } else {
            int var11 = var8 - 38400;
            while (true) {
                var9--;
                if (var9 < 0) {
                    int var12 = arg4 - arg3 & 0x3;
                    while (true) {
                        var12--;
                        if (var12 < 0) {
                            return true;
                        }
                        var10++;
                        if (var11 < arg2[var10]) {
                            return false;
                        }
                        var11 += arg1;
                    }
                }
                var10++;
                if (arg2[var10] > var11) {
                    return false;
                }
                int var13 = arg1 + var11;
                var10++;
                if (arg2[var10] > var13) {
                    return false;
                }
                int var14 = arg1 + var13;
                var10++;
                if (arg2[var10] > var14) {
                    return false;
                }
                int var15 = arg1 + var14;
                var10000 = ~var15;
                var10++;
                if (var10000 > ~arg2[var10]) {
                    return false;
                }
                var11 = arg1 + var15;
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)V", line = 106)
    public static void method3504(int arg0) {
        field8524 = null;
        if (arg0 != 3) {
            field8521 = -39;
        }
        field8525 = null;
        field8526 = null;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(BJ[ILdj;)Ljava/lang/String;", line = 130)
    public final String method551(byte arg0, long arg1, int[] arg2, class703 arg3) {
        field8522++;
        if (arg0 != 64) {
            field8524 = null;
        }
        if (class683.field9704 == arg3) {
            class547 var6 = class241.field3567.method1209(arg2[0], 969);
            return var6.method3289((int) arg1, (byte) -127);
        } else if (class169.field2391 == arg3 || class235.field3510 == arg3) {
            class424 var7 = class425.field6147.method4144((int) arg1, 123);
            return var7.field6070;
        } else if (class683.field9694 == arg3 || class743.field10362 == arg3 || class345.field4747 == arg3) {
            return class241.field3567.method1209(arg2[0], 969).method3289((int) arg1, (byte) -127);
        } else {
            return null;
        }
    }
}
