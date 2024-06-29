import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kl")
public class class152 extends class217 {

    @OriginalMember(owner = "client!kl", name = "F", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!kl", name = "G", descriptor = "I")
    public static int field2432;

    @OriginalMember(owner = "client!kl", name = "H", descriptor = "I")
    public static int field2433;

    @OriginalMember(owner = "client!kl", name = "J", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!kl", name = "I", descriptor = "Lm;")
    public static class554 field2434;

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "([IIZIIIII)Z", line = 3)
    public static final boolean method1194(int[] arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2) {
            field2434 = null;
        }
        if (~arg1 > -1) {
            arg1 = 0;
        }
        if (~arg7 < ~class597.field8526) {
            arg7 = class597.field8526;
        }
        ++field2433;
        if (arg7 <= arg1) {
            return true;
        } else {
            int var8 = -arg1 + arg7 >> 2;
            int var9 = arg1 * arg6 + arg3;
            int var10 = arg1 + -1 + arg5;
            if (~class37.field443 != -2) {
                int var11 = var9 - 38400;
                while (true) {
                    --var8;
                    if (~var8 > -1) {
                        int var12 = -arg1 + arg7 & 3;
                        while (true) {
                            --var12;
                            if (var12 < 0) {
                                return true;
                            }
                            int var10000 = ~var11;
                            ++var10;
                            if (var10000 > ~arg0[var10]) {
                                return false;
                            }
                            var11 += arg6;
                        }
                    }
                    ++var10;
                    if (~arg0[var10] < ~var11) {
                        return false;
                    }
                    int var13 = arg6 + var11;
                    ++var10;
                    if (var13 < arg0[var10]) {
                        return false;
                    }
                    int var14 = arg6 + var13;
                    ++var10;
                    if (~arg0[var10] < ~var14) {
                        return false;
                    }
                    int var15 = arg6 + var14;
                    ++var10;
                    if (var15 < arg0[var10]) {
                        return false;
                    }
                    var11 = arg6 + var15;
                }
            } else {
                class414.field5685 += var8;
                while (true) {
                    --var8;
                    if (var8 < 0) {
                        int var16 = 3 & arg7 - arg1;
                        while (true) {
                            --var16;
                            if (~var16 > -1) {
                                return true;
                            }
                            ++var10;
                            if (var9 < arg0[var10]) {
                                arg0[var10] = var9;
                            }
                            var9 += arg6;
                        }
                    }
                    ++var10;
                    if (arg0[var10] > var9) {
                        arg0[var10] = var9;
                    }
                    int var17 = arg6 + var9;
                    ++var10;
                    if (var17 < arg0[var10]) {
                        arg0[var10] = var17;
                    }
                    int var18 = arg6 + var17;
                    ++var10;
                    if (~arg0[var10] < ~var18) {
                        arg0[var10] = var18;
                    }
                    int var19 = arg6 + var18;
                    ++var10;
                    if (var19 < arg0[var10]) {
                        arg0[var10] = var19;
                    }
                    var9 = arg6 + var19;
                }
            }
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IF)V", line = 100)
    public final void method1195(int arg0, float arg1) {
        ++field2435;
        if (arg0 != 2857) {
            this.method1195(-24, -0.21795754F);
        }
        super.field3161 = arg1;
    }

    @OriginalMember(owner = "client!kl", name = "f", descriptor = "(B)V", line = 114)
    public static void method1196(byte arg0) {
        field2434 = null;
        if (arg0 >= -4) {
            field2434 = null;
        }
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IB)V", line = 124)
    public static final void method1197(int arg0, byte arg1) {
        ++field2431;
        if (arg1 > 117) {
            class371 var2 = class490.method2867((byte) -60, 11, (long) arg0);
            var2.method2215(4);
        }
    }

    @OriginalMember(owner = "client!kl", name = "<init>", descriptor = "(IIIIIF)V", line = 137)
    public class152(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!kl", name = "a", descriptor = "(IIII)V", line = 142)
    public final void method1198(int arg0, int arg1, int arg2, int arg3) {
        super.field3172 = arg2;
        ++field2432;
        super.field3157 = arg1;
        if (arg3 < -73) {
            super.field3159 = arg0;
        }
    }
}
