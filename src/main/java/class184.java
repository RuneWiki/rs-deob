import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!r")
public abstract class class184 extends class416 {

    @OriginalMember(owner = "client!r", name = "x", descriptor = "Z")
    public static boolean field2780 = false;

    @OriginalMember(owner = "client!r", name = "B", descriptor = "I")
    public static int field2783 = 0;

    @OriginalMember(owner = "client!r", name = "C", descriptor = "I")
    public static int field2784;

    @OriginalMember(owner = "client!r", name = "y", descriptor = "Lha;")
    public static class59 field2781;

    @OriginalMember(owner = "client!r", name = "z", descriptor = "[[[B")
    public static byte[][][] field2782;

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(BI[IIIIII)Z", line = 3)
    public static final boolean method1269(byte arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2784++;
        if (arg5 < 0) {
            arg5 = 0;
        }
        if (class758.field10556 < arg1) {
            arg1 = class758.field10556;
        }
        if (arg1 <= arg5) {
            return true;
        }
        int var8 = -118 / ((-arg0 - 37) / 45);
        int var9 = arg1 - arg5 >> 2;
        int var10 = arg5 + arg7 - 1;
        int var11 = arg5 * arg6 + arg4;
        int var10000;
        if (class159.field2398 == 1) {
            class462.field6335 += var9;
            while (true) {
                var9--;
                if (var9 < 0) {
                    int var17 = arg1 - arg5 & 0x3;
                    while (true) {
                        var17--;
                        if (var17 < 0) {
                            return true;
                        }
                        var10++;
                        if (arg2[var10] > var11) {
                            arg2[var10] = var11;
                        }
                        var11 += arg6;
                    }
                }
                var10000 = ~var11;
                var10++;
                if (var10000 > ~arg2[var10]) {
                    arg2[var10] = var11;
                }
                int var18 = arg6 + var11;
                var10000 = ~var18;
                var10++;
                if (var10000 > ~arg2[var10]) {
                    arg2[var10] = var18;
                }
                int var19 = arg6 + var18;
                var10++;
                if (arg2[var10] > var19) {
                    arg2[var10] = var19;
                }
                int var20 = arg6 + var19;
                var10++;
                if (var20 < arg2[var10]) {
                    arg2[var10] = var20;
                }
                var11 = arg6 + var20;
            }
        } else {
            int var12 = var11 - 38400;
            while (true) {
                var9--;
                if (var9 < 0) {
                    int var13 = arg1 - arg5 & 0x3;
                    while (true) {
                        var13--;
                        if (var13 < 0) {
                            return true;
                        }
                        var10++;
                        if (arg2[var10] > var12) {
                            return false;
                        }
                        var12 += arg6;
                    }
                }
                var10++;
                if (var12 < arg2[var10]) {
                    return false;
                }
                int var14 = arg6 + var12;
                var10000 = ~var14;
                var10++;
                if (var10000 > ~arg2[var10]) {
                    return false;
                }
                int var15 = arg6 + var14;
                var10++;
                if (var15 < arg2[var10]) {
                    return false;
                }
                int var16 = arg6 + var15;
                var10++;
                if (arg2[var10] > var16) {
                    return false;
                }
                var12 = arg6 + var16;
            }
        }
    }

    @OriginalMember(owner = "client!r", name = "a", descriptor = "(I)V", line = 100)
    public static void method1270(int arg0) {
        field2782 = null;
        if (arg0 == -1) {
            field2781 = null;
        }
    }
}
