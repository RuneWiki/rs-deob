import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class374 {

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field5075 = 765;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field5071;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field5072;

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field5073;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field5074;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(II[IIIIII)Z")
    public static final boolean method2268(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5074++;
        if (class679.field9453 < arg6) {
            arg6 = class679.field9453;
        }
        if (arg4 < 0) {
            arg4 = 0;
        }
        if (arg7 != 0) {
            return true;
        } else if (arg6 <= arg4) {
            return true;
        } else {
            int var8 = arg4 * arg5 + arg1;
            int var9 = arg4 + arg3 - 1;
            int var10 = arg6 - arg4 >> 2;
            int var10000;
            if (class190.field2930 == 1) {
                class22.field461 += var10;
                while (true) {
                    var10--;
                    if (var10 < 0) {
                        int var16 = arg6 - arg4 & 0x3;
                        while (true) {
                            var16--;
                            if (var16 < 0) {
                                return true;
                            }
                            var9++;
                            if (var8 < arg2[var9]) {
                                arg2[var9] = var8;
                            }
                            var8 += arg5;
                        }
                    }
                    var9++;
                    if (var8 < arg2[var9]) {
                        arg2[var9] = var8;
                    }
                    int var17 = arg5 + var8;
                    var9++;
                    if (var17 < arg2[var9]) {
                        arg2[var9] = var17;
                    }
                    int var18 = arg5 + var17;
                    var10000 = ~var18;
                    var9++;
                    if (var10000 > ~arg2[var9]) {
                        arg2[var9] = var18;
                    }
                    int var19 = arg5 + var18;
                    var9++;
                    if (var19 < arg2[var9]) {
                        arg2[var9] = var19;
                    }
                    var8 = arg5 + var19;
                }
            } else {
                int var11 = var8 - 38400;
                while (true) {
                    var10--;
                    if (var10 < 0) {
                        int var12 = arg6 - arg4 & 0x3;
                        while (true) {
                            var12--;
                            if (var12 < 0) {
                                return true;
                            }
                            var9++;
                            if (var11 < arg2[var9]) {
                                return false;
                            }
                            var11 += arg5;
                        }
                    }
                    var9++;
                    if (arg2[var9] > var11) {
                        return false;
                    }
                    int var13 = arg5 + var11;
                    var10000 = ~var13;
                    var9++;
                    if (var10000 > ~arg2[var9]) {
                        return false;
                    }
                    int var14 = arg5 + var13;
                    var9++;
                    if (arg2[var9] > var14) {
                        return false;
                    }
                    int var15 = arg5 + var14;
                    var10000 = ~var15;
                    var9++;
                    if (var10000 > ~arg2[var9]) {
                        return false;
                    }
                    var11 = arg5 + var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/lang/String;I)Ljava/lang/Class;")
    public static final Class method2269(String arg0, int arg1) throws ClassNotFoundException {
        field5071++;
        if (arg1 != -12416) {
            return null;
        } else if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg0.equals("C")) {
            return Character.TYPE;
        } else {
            return Class.forName(arg0);
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IILgj;IIZ)V")
    public static final void method2270(int arg0, int arg1, class662 arg2, int arg3, int arg4, boolean arg5) {
        class326.method2067(arg4, arg0, (byte) 3, (long) arg3, arg1, arg5, arg2);
        field5073++;
    }
}
