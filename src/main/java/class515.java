import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class515 {

    @OriginalMember(owner = "client!nga", name = "f", descriptor = "I")
    public static int field7306 = 0;

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "I")
    public static int field7301;

    @OriginalMember(owner = "client!nga", name = "b", descriptor = "I")
    public static int field7302;

    @OriginalMember(owner = "client!nga", name = "d", descriptor = "I")
    public static int field7304;

    @OriginalMember(owner = "client!nga", name = "e", descriptor = "Lvn;")
    public static class313 field7305;

    @OriginalMember(owner = "client!nga", name = "c", descriptor = "[I")
    public static int[] field7303;

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(II)V")
    public static final void method3040(int arg0, int arg1) {
        field7302++;
        class150 var2 = class676.method3885(1000, 4, arg1);
        var2.method1115(true);
        if (arg0 != -2) {
            method3042(-25);
        }
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(III[IIIII)Z")
    public static final boolean method3041(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 > class270.field3864) {
            arg6 = class270.field3864;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        field7301++;
        if (arg6 <= arg1) {
            return true;
        }
        int var8 = arg1 * arg5 + arg4;
        int var9 = arg1 + arg2 - 1;
        int var10 = arg6 - arg1 >> 2;
        if (class505.field7182 == 1) {
            class357.field5193 += var10;
            label90: while (true) {
                var10--;
                if (var10 < 0) {
                    int var11 = arg6 - arg1 & 0x3;
                    while (true) {
                        var11--;
                        if (var11 < 0) {
                            break label90;
                        }
                        var9++;
                        if (arg3[var9] > var8) {
                            arg3[var9] = var8;
                        }
                        var8 += arg5;
                    }
                }
                var9++;
                if (arg3[var9] > var8) {
                    arg3[var9] = var8;
                }
                int var12 = arg5 + var8;
                var9++;
                if (var12 < arg3[var9]) {
                    arg3[var9] = var12;
                }
                int var13 = arg5 + var12;
                var9++;
                if (arg3[var9] > var13) {
                    arg3[var9] = var13;
                }
                int var14 = arg5 + var13;
                var9++;
                if (var14 < arg3[var9]) {
                    arg3[var9] = var14;
                }
                var8 = arg5 + var14;
            }
        } else {
            int var15 = var8 - 38400;
            label79: while (true) {
                var10--;
                if (var10 < 0) {
                    int var16 = arg6 - arg1 & 0x3;
                    while (true) {
                        var16--;
                        if (var16 < 0) {
                            break label79;
                        }
                        var9++;
                        if (arg3[var9] > var15) {
                            return false;
                        }
                        var15 += arg5;
                    }
                }
                var9++;
                if (arg3[var9] > var15) {
                    return false;
                }
                int var17 = arg5 + var15;
                int var10000 = ~var17;
                var9++;
                if (var10000 > ~arg3[var9]) {
                    return false;
                }
                int var18 = arg5 + var17;
                var10000 = ~var18;
                var9++;
                if (var10000 > ~arg3[var9]) {
                    return false;
                }
                int var19 = arg5 + var18;
                var9++;
                if (arg3[var9] > var19) {
                    return false;
                }
                var15 = arg5 + var19;
            }
        }
        if (arg7 < 3) {
            method3042(50);
        }
        return true;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(I)V")
    public static void method3042(int arg0) {
        field7303 = null;
        if (arg0 != -7476) {
            method3040(41, -59);
        }
        field7305 = null;
    }

    @OriginalMember(owner = "client!nga", name = "a", descriptor = "(B)V")
    public static final void method3043(byte arg0) {
        field7304++;
        class418.method2637(-119);
        class419.field6265 = false;
        if (arg0 != 90) {
            field7303 = null;
        }
    }
}
