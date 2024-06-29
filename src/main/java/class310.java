import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tha")
public abstract class class310 {

    @OriginalMember(owner = "client!tha", name = "b", descriptor = "Llja;")
    public static class744 field3849 = new class744(36, 2);

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "I")
    public static int field3848;

    @OriginalMember(owner = "client!tha", name = "c", descriptor = "I")
    public static int field3850;

    @OriginalMember(owner = "client!tha", name = "d", descriptor = "[Ltf;")
    public static class312[] field3851;

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(BJ)I")
    public final int method1830(byte arg0, long arg1) {
        field3850++;
        long var4 = this.method1836(true);
        if (var4 > 0L) {
            class594.method3405(var4, 16711680);
        }
        return arg0 > -37 ? 76 : this.method1835(arg1, 3);
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(I)J")
    public abstract long method1831(int arg0);

    @OriginalMember(owner = "client!tha", name = "b", descriptor = "(I)V")
    public static void method1832(int arg0) {
        field3851 = null;
        field3849 = null;
        if (arg0 != -23955) {
            method1832(-2);
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(B)V")
    public abstract void method1833(byte arg0);

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(IIBII[III)Z")
    public static final boolean method1834(int arg0, int arg1, byte arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
        field3848++;
        if (arg1 > class594.field8079) {
            arg1 = class594.field8079;
        }
        if (arg3 < 0) {
            arg3 = 0;
        }
        if (arg1 <= arg3) {
            return true;
        }
        int var8 = arg1 - arg3 >> 2;
        int var9 = arg3 * arg4 + arg0;
        int var10 = 95 / (arg2 / 52);
        int var11 = arg3 + arg6 - 1;
        if (class480.field6714 == 1) {
            class107.field1353 += var8;
            while (true) {
                var8--;
                if (var8 < 0) {
                    int var12 = arg1 - arg3 & 0x3;
                    while (true) {
                        var12--;
                        if (var12 < 0) {
                            return true;
                        }
                        var11++;
                        if (arg5[var11] > var9) {
                            arg5[var11] = var9;
                        }
                        var9 += arg4;
                    }
                }
                var11++;
                if (arg5[var11] > var9) {
                    arg5[var11] = var9;
                }
                int var13 = arg4 + var9;
                var11++;
                if (var13 < arg5[var11]) {
                    arg5[var11] = var13;
                }
                int var14 = arg4 + var13;
                var11++;
                if (arg5[var11] > var14) {
                    arg5[var11] = var14;
                }
                int var15 = arg4 + var14;
                var11++;
                if (var15 < arg5[var11]) {
                    arg5[var11] = var15;
                }
                var9 = arg4 + var15;
            }
        } else {
            int var16 = var9 - 38400;
            while (true) {
                var8--;
                if (var8 < 0) {
                    int var17 = arg1 - arg3 & 0x3;
                    while (true) {
                        var17--;
                        if (var17 < 0) {
                            return true;
                        }
                        var11++;
                        if (arg5[var11] > var16) {
                            return false;
                        }
                        var16 += arg4;
                    }
                }
                int var10000 = ~var16;
                var11++;
                if (var10000 > ~arg5[var11]) {
                    return false;
                }
                int var18 = arg4 + var16;
                var11++;
                if (var18 < arg5[var11]) {
                    return false;
                }
                int var19 = arg4 + var18;
                var11++;
                if (var19 < arg5[var11]) {
                    return false;
                }
                int var20 = arg4 + var19;
                var11++;
                if (arg5[var11] > var20) {
                    return false;
                }
                var16 = arg4 + var20;
            }
        }
    }

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(JI)I")
    public abstract int method1835(long arg0, int arg1);

    @OriginalMember(owner = "client!tha", name = "a", descriptor = "(Z)J")
    public abstract long method1836(boolean arg0);
}
