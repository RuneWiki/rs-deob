import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class311 {

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "Ltq;")
    public static class536 field3893 = new class536(8);

    @OriginalMember(owner = "client!dba", name = "b", descriptor = "I")
    public static int field3894;

    @OriginalMember(owner = "client!dba", name = "c", descriptor = "I")
    public static int field3895;

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(I)V")
    public static void method1831(int arg0) {
        field3893 = null;
        if (arg0 != -18064) {
            method1832(73, 39, 43);
        }
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(III)Z")
    public static final boolean method1832(int arg0, int arg1, int arg2) {
        field3894++;
        int var3 = 41 / ((arg1 - 50) / 62);
        return (arg2 & 0x18) != 0 | (arg2 & 0x220) == 544;
    }

    @OriginalMember(owner = "client!dba", name = "a", descriptor = "(IIIIII[II)Z")
    public static final boolean method1833(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7) {
        if (class566.field7172 < arg3) {
            arg3 = class566.field7172;
        }
        field3895++;
        if (arg0 >= -77) {
            field3893 = null;
        }
        if (arg2 < 0) {
            arg2 = 0;
        }
        if (arg2 >= arg3) {
            return true;
        }
        int var8 = arg2 + arg1 - 1;
        int var9 = arg2 * arg4 + arg5;
        int var10 = arg3 - arg2 >> 2;
        if (class191.field2669 == 1) {
            class430.field5647 += var10;
            while (true) {
                var10--;
                int var10000;
                if (var10 < 0) {
                    int var11 = arg3 - arg2 & 0x3;
                    while (true) {
                        var11--;
                        if (var11 < 0) {
                            return true;
                        }
                        var10000 = ~var9;
                        var8++;
                        if (var10000 > ~arg6[var8]) {
                            arg6[var8] = var9;
                        }
                        var9 += arg4;
                    }
                }
                var10000 = ~var9;
                var8++;
                if (var10000 > ~arg6[var8]) {
                    arg6[var8] = var9;
                }
                int var12 = arg4 + var9;
                var8++;
                if (arg6[var8] > var12) {
                    arg6[var8] = var12;
                }
                int var13 = arg4 + var12;
                var8++;
                if (var13 < arg6[var8]) {
                    arg6[var8] = var13;
                }
                int var14 = arg4 + var13;
                var8++;
                if (arg6[var8] > var14) {
                    arg6[var8] = var14;
                }
                var9 = arg4 + var14;
            }
        } else {
            int var15 = var9 - 38400;
            while (true) {
                var10--;
                if (var10 < 0) {
                    int var16 = arg3 - arg2 & 0x3;
                    while (true) {
                        var16--;
                        if (var16 < 0) {
                            return true;
                        }
                        var8++;
                        if (arg6[var8] > var15) {
                            return false;
                        }
                        var15 += arg4;
                    }
                }
                var8++;
                if (arg6[var8] > var15) {
                    return false;
                }
                int var17 = arg4 + var15;
                var8++;
                if (arg6[var8] > var17) {
                    return false;
                }
                int var18 = arg4 + var17;
                var8++;
                if (arg6[var8] > var18) {
                    return false;
                }
                int var19 = arg4 + var18;
                var8++;
                if (var19 < arg6[var8]) {
                    return false;
                }
                var15 = arg4 + var19;
            }
        }
    }
}
