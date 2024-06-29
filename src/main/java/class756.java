import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class756 {

    @OriginalMember(owner = "client!lo", name = "e", descriptor = "Lkg;")
    public static class275 field10545 = new class275(52, -1);

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
    public static int field10541;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
    public static int field10542;

    @OriginalMember(owner = "client!lo", name = "c", descriptor = "I")
    public static int field10543;

    @OriginalMember(owner = "client!lo", name = "d", descriptor = "I")
    public static int field10544;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(IIZII)V")
    public static final void method4199(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field10542++;
        if (class525.method3039(4, arg1)) {
            class643.method3613(arg2, arg4, arg0, class218.field2938[arg1], arg3, 102);
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(B)V")
    public static void method4200(byte arg0) {
        field10545 = null;
        if (arg0 != -57) {
            field10545 = null;
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "([IZIIIIII)Z")
    public static final boolean method4201(int[] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1) {
            return true;
        }
        if (arg7 < 0) {
            arg7 = 0;
        }
        if (arg6 > class646.field8938) {
            arg6 = class646.field8938;
        }
        field10541++;
        if (arg7 >= arg6) {
            return true;
        }
        int var8 = arg6 - arg7 >> 2;
        int var9 = arg7 + arg2 - 1;
        int var10 = arg5 * arg7 + arg3;
        if (class423.field5382 == 1) {
            class700.field9738 += var8;
            while (true) {
                var8--;
                if (var8 < 0) {
                    int var11 = arg6 - arg7 & 0x3;
                    while (true) {
                        var11--;
                        if (var11 < 0) {
                            return true;
                        }
                        var9++;
                        if (arg0[var9] > var10) {
                            arg0[var9] = var10;
                        }
                        var10 += arg5;
                    }
                }
                var9++;
                if (arg0[var9] > var10) {
                    arg0[var9] = var10;
                }
                int var12 = arg5 + var10;
                var9++;
                if (arg0[var9] > var12) {
                    arg0[var9] = var12;
                }
                int var13 = arg5 + var12;
                var9++;
                if (var13 < arg0[var9]) {
                    arg0[var9] = var13;
                }
                int var14 = arg5 + var13;
                var9++;
                if (arg0[var9] > var14) {
                    arg0[var9] = var14;
                }
                var10 = arg5 + var14;
            }
        } else {
            int var15 = var10 - 38400;
            while (true) {
                var8--;
                if (var8 < 0) {
                    int var16 = arg6 - arg7 & 0x3;
                    while (true) {
                        var16--;
                        if (var16 < 0) {
                            return true;
                        }
                        var9++;
                        if (var15 < arg0[var9]) {
                            return false;
                        }
                        var15 += arg5;
                    }
                }
                var9++;
                if (arg0[var9] > var15) {
                    return false;
                }
                int var17 = arg5 + var15;
                var9++;
                if (arg0[var9] > var17) {
                    return false;
                }
                int var18 = arg5 + var17;
                var9++;
                if (arg0[var9] > var18) {
                    return false;
                }
                int var19 = arg5 + var18;
                var9++;
                if (arg0[var9] > var19) {
                    return false;
                }
                var15 = arg5 + var19;
            }
        }
    }

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(Z)Z")
    public static final boolean method4202(boolean arg0) {
        if (arg0) {
            method4200((byte) -34);
        }
        field10544++;
        return class151.field2086;
    }
}
